public void evaluate(main.java.iitb.neo.extract.ExtractFromCorpus efc, boolean verbose, java.io.PrintWriter resultWriter) throws java.io.IOException, java.sql.SQLException {
    main.java.iitb.neo.autoeval.EvaluateModel.Results r = new main.java.iitb.neo.autoeval.EvaluateModel.Results();
    java.util.List<edu.washington.multirframework.data.Extraction> modelExtractions = efc.getExtractions("_results_", false, verbose, verboseFile);
    r.fillResult(modelExtractions);
    r.dumpResults(resultWriter);
}
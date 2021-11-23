public void evaluate() throws java.io.IOException, java.sql.SQLException {
    java.util.List<edu.washington.multirframework.data.Extraction> modelExtractions = efc.getExtractions(("_results_" + (new java.io.File(modelName).getName())), writeExtractions, verbose, verboseFile);
    res.fillResult(modelExtractions);
    res.dumpResults();
}
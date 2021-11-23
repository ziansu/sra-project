public void printCSV(java.lang.String doc) {
    java.util.Map<pl.edu.icm.cermine.evaluation.tools.EvalInformationType, pl.edu.icm.cermine.evaluation.tools.SingleInformationDocResult> docResults = results.get(doc);
    java.lang.System.out.print(doc);
    for (pl.edu.icm.cermine.evaluation.tools.EvalInformationType type : evalTypes) {
        java.lang.System.out.println(",");
        docResults.get(type).printCSV();
    }
    java.lang.System.out.println("");
}
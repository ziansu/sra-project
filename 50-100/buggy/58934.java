public static void displayResult(int comboSelection) {
    java.lang.String selection = null;
    if (comboSelection == (-1)) {
        selection = ((("Indexing time of " + (tracing.views.VariableResources.getNumberOfFiles())) + " requirement(s) is: ") + (tracing.views.VariableResources.getIndexTime())) + " seconds.";
    }else {
        selection = tracing.views.VariableResources.fileIndexesStoring.get(comboSelection);
    }
    tracing.views.VariableResources.indicesText.setText(selection);
}
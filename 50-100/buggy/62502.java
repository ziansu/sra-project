public static void tokenizeFiles() {
    for (int i = 0; i < (tracing.views.VariableResources.textFilesInFolder.size()); i++) {
        java.lang.String text = tracing.views.VariableResources.fileContent.get(i);
        java.lang.String index = tracing.views.VariableResources.tokenize(text);
        tracing.views.VariableResources.fileIndexesStoring.add(i, index);
    }
    tracing.views.VariableResources.saveIndexes();
}
public void handleImportResult(int resultCode, android.content.Intent data) {
    if (resultCode == (android.app.Activity.RESULT_OK)) {
        java.lang.String filePath = data.getData().getPath();
        try {
            dataImporterExporter.importFromFile(filePath);
        } catch (java.lang.RuntimeException e) {
            guiError.showErrorDialogAndContinue(e);
        }
        dictionary.reloadData();
    }
}
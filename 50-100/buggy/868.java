public void selectSheet(java.lang.String sheetName) throws java.lang.Exception {
    if (importedSheets.containsKey(sheetName)) {
        this.selectedSheet = importedSheets.get(sheetName);
    }else {
        throw new java.lang.Exception((("Sheet with name '" + sheetName) + "' doesn't exist!"));
    }
}
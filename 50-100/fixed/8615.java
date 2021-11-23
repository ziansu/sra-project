private void importFile(java.lang.String fileName) throws java.io.IOException {
    if (!(fileSelecMap.containsKey(fileName))) {
        fileNameLists.add(fileName);
        fileList.setItems(javafx.collections.FXCollections.observableArrayList(fileNameLists));
    }
    java.io.File f = new java.io.File((((application.Controller.currentProgramFolder) + "/") + fileName));
    fileSelecMap.put(fileName, parseFile(f));
}
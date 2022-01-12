private void exportFile(java.lang.String command) throws java.io.IOException {
    java.lang.String newFileName = myParser.getTitle(command);
    fileName = newFileName;
    fileOperation = new storage.JsonStringFileOperation(newFileName);
    if (!(fileList.contains(newFileName))) {
        fileList.add(newFileName);
    }
    saveFile();
    saveConfiguration();
    ui.list.swing.LayoutSetting.setFilePathLabel();
    showMessage("Export successfully");
}
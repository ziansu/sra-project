public java.util.List<java.io.File> getSelectedFiles() {
    if ((chooserType) == (FileChooserType.save)) {
        return java.util.Arrays.asList(new java.io.File(currentFolder, selectedFilesTextField.getText()));
    }else {
        final java.util.List<java.io.File> files = getAllSelectedFiles();
        return getFilteredSelectedFiles(files);
    }
}
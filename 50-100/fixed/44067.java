java.lang.String fileSaveDialog(java.lang.String startDirectory, java.lang.String filePattern) {
    java.awt.FileDialog d = new java.awt.FileDialog(((java.awt.Frame) (null)), "File Save", java.awt.FileDialog.SAVE);
    d.setFile(filePattern);
    d.setDirectory(startDirectory);
    d.show();
    java.lang.String filename = d.getFile();
    if (filename == null) {
        filename = "";
    }
    return (d.getDirectory()) + (d.getFile());
}
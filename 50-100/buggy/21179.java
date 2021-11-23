private static java.lang.String getExtension(java.io.File file) {
    java.lang.String extension = "";
    int i = file.getAbsolutePath().lastIndexOf('.');
    int p = java.lang.Math.max(file.getAbsolutePath().lastIndexOf('/'), file.getAbsolutePath().lastIndexOf('\\'));
    if ((i > 0) && (i > p)) {
        extension = Controller.chooser.getSelectedFile().getAbsolutePath().substring((i + 1));
    }
    return extension;
}
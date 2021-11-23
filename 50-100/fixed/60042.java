static java.lang.String getLibraryDirectory() {
    javafx.stage.DirectoryChooser directoryChooser = new javafx.stage.DirectoryChooser();
    java.io.File libraryFolder = directoryChooser.showDialog(null);
    java.lang.String libFile = libraryFolder.getAbsolutePath();
    libFile = libFile.replace("\\", "/");
    Variables.libraryDirTxt.setText(libFile);
    return libFile;
}
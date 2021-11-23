private java.lang.String getFileName() {
    java.lang.String fname = getFileContents().getFilename();
    fname = fname.substring(((fname.lastIndexOf(java.io.File.separatorChar)) + 1));
    fname = fname.replaceAll("\\.[^\\.]*$", "");
    return fname;
}
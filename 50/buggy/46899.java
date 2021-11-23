public boolean accept(java.io.File arg0, java.lang.String arg1) {
    return (arg0.isFile()) && (!(arg1.toLowerCase().endsWith("tif")));
}
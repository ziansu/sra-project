public boolean accept(java.io.File file) {
    return (file.isFile()) && (!(file.getName().toLowerCase().endsWith("tif")));
}
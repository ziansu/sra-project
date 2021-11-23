public void fixFiles() {
    java.lang.String extension = ".csv";
    java.util.List<java.lang.String> names = com.alphatica.genotick.data.DataUtils.listFiles(extension, path);
    if (names == null) {
        throw new com.alphatica.genotick.data.DataException(("Unable to list files in " + (path)));
    }
    for (java.lang.String name : names) {
        fixFile(name);
    }
}
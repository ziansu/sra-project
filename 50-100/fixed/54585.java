public java.lang.String[] getFilenames() throws java.io.IOException {
    java.util.List<java.lang.String> allFileNames = new java.util.ArrayList<>();
    for (java.io.File f : files) {
        allFileNames.add(f.getCanonicalPath());
    }
    return allFileNames.toArray(new java.lang.String[allFileNames.size()]);
}
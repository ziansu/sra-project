public java.lang.String getAlgorithmDirectory() {
    java.lang.String pathToFolder = "";
    try {
        pathToFolder = java.lang.Thread.currentThread().getContextClassLoader().getResource("algorithms").getPath();
    } catch (java.lang.NullPointerException e) {
        throw new java.lang.NullPointerException("Algorithm directory is missing!");
    }
    return pathToFolder;
}
public java.lang.String getAlgorithmDirectory() {
    java.lang.String pathToFolder = "";
    try {
        pathToFolder = java.lang.Thread.currentThread().getContextClassLoader().getResource("algorithms").getPath();
    } catch (java.lang.NullPointerException e) {
        java.lang.System.out.print("Algorithm directory is missing!");
    }
    return pathToFolder;
}
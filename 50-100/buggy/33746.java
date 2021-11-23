private java.lang.String relativePath(java.lang.String folder) {
    java.lang.String[] dirs = new java.lang.String((((basePackage) + ".") + folder)).split("\\Q.\\E");
    java.lang.String relativePath = "";
    for (java.lang.String eachDir : dirs) {
        relativePath = (relativePath + (java.io.File.separator)) + eachDir;
    }
    return relativePath;
}
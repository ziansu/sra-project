@java.lang.SuppressWarnings(value = "unused")
private java.util.Set<java.io.File> calculateContainedFilesRecursively(java.io.File directory) {
    java.util.Set<java.io.File> result = new java.util.TreeSet<java.io.File>();
    if (null == (directory.listFiles())) {
        return result;
    }
    for (java.io.File file : directory.listFiles()) {
        result.add(file);
        if (file.isDirectory()) {
            result.addAll(calculateContainedFilesRecursively(file));
        }
    }
    return result;
}
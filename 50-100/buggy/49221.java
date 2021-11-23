private static java.lang.String getExecutionDirectory(java.lang.String filePath, java.lang.String packageName) {
    if (packageName.isEmpty()) {
        return null;
    }
    java.lang.String packageAsDirectory = packageName.replace(".", java.lang.System.getProperty("file.separator"));
    int index = filePath.lastIndexOf(packageAsDirectory);
    if (index < 0) {
        return null;
    }
    return filePath.substring(0, index);
}
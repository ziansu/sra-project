private java.lang.String formatClassName(java.lang.String nextLine) {
    java.lang.String className = null;
    if (((nextLine != null) && (nextLine.contains(".java"))) && (nextLine.contains("/src"))) {
        className = nextLine.substring(nextLine.indexOf("/src"), nextLine.indexOf(".java"));
        className = className.replace("/", ".");
        className = className.replace(".src.", "");
    }
    return className;
}
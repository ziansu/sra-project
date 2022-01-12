private java.util.List<java.lang.String> extractPath(java.lang.String path) {
    java.util.List<java.lang.String> newPath = new java.util.ArrayList<java.lang.String>();
    java.util.regex.Matcher m = java.util.regex.Pattern.compile("\\(([^)]+)\\)").matcher(path);
    while (m.find()) {
        java.lang.String node = m.group(1);
        newPath.add(node);
    } 
    return newPath;
}
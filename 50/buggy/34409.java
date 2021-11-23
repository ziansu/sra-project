private static java.lang.String getPathValue(java.lang.String pathlet) {
    java.lang.String pathValue = pathlet.substring(0, pathlet.indexOf("["));
    return pathValue;
}
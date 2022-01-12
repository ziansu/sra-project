private static java.lang.String getPathValue(java.lang.String pathlet) {
    java.lang.String pathValue = ((pathlet.indexOf("[")) != (-1)) ? pathlet.substring(0, pathlet.indexOf("[")) : pathlet;
    return pathValue;
}
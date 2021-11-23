private java.util.List<java.lang.String> getClassPathEntries() {
    java.lang.String separator = getPathSeparator();
    java.lang.String classpath = getClassPathString();
    java.util.List<java.lang.String> classPathEntries = new java.util.ArrayList<java.lang.String>();
    return addFromCPString(separator, classpath, classPathEntries, null);
}
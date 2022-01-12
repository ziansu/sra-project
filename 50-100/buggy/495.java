public java.lang.String addToClasspathImpl(java.util.Collection<java.lang.String> classpaths, java.util.Collection<java.lang.String> paths) {
    java.util.List<java.lang.String> allPaths = new java.util.ArrayList<>();
    if (classpaths != null) {
        allPaths.addAll(classpaths);
    }
    if (paths != null) {
        allpaths.addAll(classpaths);
    }
    return org.apache.commons.lang.StringUtils.join(allPaths, org.apache.storm.utils.Utils.CLASS_PATH_SEPARATOR);
}
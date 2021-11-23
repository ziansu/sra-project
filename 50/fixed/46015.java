private static java.lang.String getClassNameFromFile(java.lang.String fileName) {
    return fileName.substring(0, ((fileName.length()) - (spaska.framework.PackageClassesDiscovery.CLASS_SUFFIX_LENGTH)));
}
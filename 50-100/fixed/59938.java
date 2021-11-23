public static java.lang.String getFileSuffix(java.lang.String fileName) {
    java.lang.String suffix = null;
    if (fileName == null) {
        return suffix;
    }
    java.lang.String[] fileNameSplitInfo = fileName.split("\\.");
    if ((fileNameSplitInfo.length) >= 1) {
        suffix = fileNameSplitInfo[((fileNameSplitInfo.length) - 1)];
    }
    return suffix;
}
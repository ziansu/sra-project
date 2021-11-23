public static java.lang.String getFileSuffix(java.lang.String fileName) {
    java.lang.String[] fileNameSplitInfo = fileName.split("\\.");
    java.lang.String suffix = null;
    if ((fileNameSplitInfo.length) >= 1) {
        suffix = fileNameSplitInfo[((fileNameSplitInfo.length) - 1)];
    }
    return suffix;
}
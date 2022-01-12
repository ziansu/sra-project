public static java.lang.String concat(java.lang.String path1, java.lang.String path2) {
    if (com.google.common.base.Strings.isNullOrEmpty(path2)) {
        return path1;
    }
    if (com.google.common.base.Strings.isNullOrEmpty(path1)) {
        return path2;
    }
    return ((org.trustedanalytics.cfbroker.store.hdfs.helper.DirHelper.removeTrailingSlashes(path1)) + "/") + (org.trustedanalytics.cfbroker.store.hdfs.helper.DirHelper.removeLeadingSlashes(path2));
}
public static java.lang.String getEndPath(java.lang.String path) {
    com.zuoxiaolong.niubi.job.core.helper.AssertHelper.notNull(path, "path can't be null.");
    return (path.indexOf("/")) >= 0 ? path.substring(((path.lastIndexOf("/")) + 1)) : path;
}
public static java.lang.String mimeFor(@lombok.NonNull
java.lang.String name) {
    if (name.isEmpty()) {
        return "";
    }
    lombok.val ext = pw.phylame.ycl.io.PathUtils.extensionName(name);
    if (ext.isEmpty()) {
        return pw.phylame.ycl.io.PathUtils.UNKNOWN_MIME;
    }
    return pw.phylame.ycl.io.PathUtils.mimeMap.get().getProperty(name, pw.phylame.ycl.io.PathUtils.UNKNOWN_MIME);
}
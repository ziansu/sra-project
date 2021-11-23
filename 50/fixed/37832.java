private java.util.ArrayList<java.net.URL> getDevFileList() {
    java.lang.String path = (getExecutablePath()) + "../../dist/rAmbilight.app/Contents/Resources/plugins";
    return getFileList(path);
}
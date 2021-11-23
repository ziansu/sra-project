public static java.net.URL load(java.lang.String path) throws java.io.IOException {
    java.net.URL url = we.software.gui.LoadAssets.class.getResource(("/" + path));
    return url;
}
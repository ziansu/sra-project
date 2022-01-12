public static java.net.URL load(java.lang.String path) throws java.io.IOException {
    return we.software.gui.LoadAssets.class.getResource(("/" + path));
}
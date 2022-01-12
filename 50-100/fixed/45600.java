@java.lang.Override
protected java.lang.String[] loadVertexShader(java.net.URL url, int version) {
    try {
        java.lang.String[] vertSrc0 = processing.core.PApplet.loadStrings(url.openStream());
        return preprocessVertexSource(vertSrc0, version);
    } catch (java.io.IOException e) {
        processing.core.PGraphics.showException(("Cannot load vertex shader " + (url.getFile())));
    }
    return null;
}
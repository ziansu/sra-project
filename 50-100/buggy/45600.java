@java.lang.Override
protected java.lang.String[] loadVertexShader(java.net.URL url, int version) {
    try {
        if ((processing.core.PApplet.platform) == (processing.core.PConstants.MACOSX)) {
            java.lang.String[] vertSrc0 = processing.core.PApplet.loadStrings(url.openStream());
            return preprocessVertexSource(vertSrc0, 130);
        }else {
            return processing.core.PApplet.loadStrings(url.openStream());
        }
    } catch (java.io.IOException e) {
        processing.core.PGraphics.showException(("Cannot load vertex shader " + (url.getFile())));
    }
    return null;
}
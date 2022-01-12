public java.io.File getFileForInternalStyle(java.lang.String name) {
    if (!(internalRenderers.containsKey(name))) {
        return new java.io.File(app.getAppPath(IndexConstants.RENDERERS_DIR), "style.render.xml");
    }
    java.io.File fl = new java.io.File(app.getAppPath(IndexConstants.RENDERERS_DIR), internalRenderers.get(name));
    return fl;
}
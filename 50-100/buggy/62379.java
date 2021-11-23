public void point(float x, float y, float z) {
    if ((_currType) != (loon.opengl.GLRenderer.GLType.Point)) {
        throw new java.lang.RuntimeException("Must call begin(GLType.Point)");
    }
    checkDirty();
    checkFlush(1);
    _renderer.color(_color);
    _renderer.vertex(x, y, z);
}
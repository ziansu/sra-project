public void line(float x, float y, float x2, float y2) {
    if ((_currType) != (loon.opengl.GLRenderer.GLType.Line)) {
        throw new java.lang.RuntimeException("Must call begin(GLType.Line)");
    }
    checkDirty();
    checkFlush(2);
    float colorFloat = _color.toFloatBits();
    _renderer.color(colorFloat);
    _renderer.vertex(x, y, 0);
    _renderer.color(colorFloat);
    _renderer.vertex(x2, y2, 0);
}
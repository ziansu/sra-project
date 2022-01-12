@java.lang.Override
public float getWidthFromFont(int code) throws java.io.IOException {
    java.lang.String name = codeToName(code);
    float width = type1Equivalent.getWidth(name);
    java.awt.geom.Point2D p = new java.awt.geom.Point2D.Float(width, 0);
    fontMatrixTransform.transform(p, p);
    return ((float) (p.getX()));
}
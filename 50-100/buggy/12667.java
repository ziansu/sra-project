@java.lang.Override
public G2D.Vector2D transform(app2dapi.geometry.G2D.Vector2D v) {
    java.awt.geom.Point2D.Double jp = new java.awt.geom.Point2D.Double(v.x(), v.y());
    trans.deltaTransform(jp, jp);
    return new app2dpcimpl.geometry.PVD2DImpl(jp.x, jp.y);
}
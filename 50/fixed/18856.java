@java.lang.Override
public app2dapi.geometry.G2D.Point2D transform(app2dapi.geometry.G2D.Point2D p) {
    java.awt.geom.Point2D.Double jp = new java.awt.geom.Point2D.Double(p.x(), p.y());
    trans.transform(jp, jp);
    return new app2dpcimpl.geometry.PVD2DImpl(jp.x, jp.y);
}
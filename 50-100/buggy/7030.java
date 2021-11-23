public sun.java2d.SurfaceData replaceSurfaceData() {
    if (((peer) == null) || (getBounds().isEmpty())) {
        surfaceData = sun.java2d.NullSurfaceData.theInstance;
        return surfaceData;
    }
    sun.awt.CGraphicsConfig gc = ((sun.awt.CGraphicsConfig) (getGraphicsConfiguration()));
    surfaceData = gc.createSurfaceData(this);
    setScale(gc.getDevice().getScaleFactor());
    if ((surfaceData) instanceof sun.java2d.opengl.CGLSurfaceData) {
        validate(((sun.java2d.opengl.CGLSurfaceData) (surfaceData)));
    }
    return surfaceData;
}
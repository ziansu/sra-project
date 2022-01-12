@java.lang.Override
public void display(javax.media.opengl.GLAutoDrawable gLDrawable) {
    setGL(gLDrawable);
    drawScene();
    if (((org.geogebra.desktop.geogebra3D.euclidian3D.EuclidianView3DD) (view3D)).hasPrinter()) {
        if ((type) == (RendererType.SHADER)) {
            ((org.geogebra.desktop.geogebra3D.euclidian3D.EuclidianView3DD) (view3D)).exportToPrinter3D();
        }
    }
}
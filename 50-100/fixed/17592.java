public final void render(org.glob3.mobile.generated.G3MRenderContext rc, org.glob3.mobile.generated.GLState glState) {
    org.glob3.mobile.generated.GL gl = rc.getGL();
    createGLState();
    org.glob3.mobile.generated.Mesh mesh = getMesh(rc);
    if (mesh != null) {
        mesh.render(rc, _glState);
    }
}
private void init(boolean translucent, int depth, int stencil) {
    getHolder().addCallback(this);
    getHolder().setType(SurfaceHolder.SURFACE_TYPE_GPU);
    initGLES();
}
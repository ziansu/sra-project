public void init(android.hardware.Camera camera) {
    setCamera(camera);
    mAutoFocusHandler = new android.os.Handler();
    getHolder().addCallback(this);
    getHolder().setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
}
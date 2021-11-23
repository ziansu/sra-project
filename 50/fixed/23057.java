public void startWidget() {
    if ((_g3mWidget) != null) {
        _motionEventProcessor = new org.glob3.mobile.specific.MotionEventProcessor(this, _canvas.getCanvasElement());
        jsAddResizeHandler(_canvas.getCanvasElement());
        jsStartRenderLoop();
    }
}
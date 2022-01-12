private void addGCanvasView() {
    java.lang.String backgroundColor = getDomObject().getStyles().getBackgroundColor();
    mSurfaceView = new com.alibaba.weex.plugin.gcanvas.GWXSurfaceView(getContext(), this);
    if (backgroundColor.isEmpty()) {
        backgroundColor = "rgba(0,0,0,0)";
    }
    mSurfaceView.setBackgroundColor(backgroundColor);
}
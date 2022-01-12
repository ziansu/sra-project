@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    this.surfaceHolder = holder;
    if ((((dirty) == null) || ((dirty.bottom) == 0)) || ((dirty.right) == 0)) {
        dirty = new android.graphics.Rect(0, 0, this.getWidth(), this.getHeight());
    }
    if ((surfaceHolder) != null) {
        this.refresh();
    }
}
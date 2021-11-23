@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    pudding.setBoundingRect(new android.graphics.Rect(0, 0, width, height));
}
@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    android.graphics.Rect boundingRect = new android.graphics.Rect(0, 0, width, height);
    pudding.setBoundingRect(boundingRect);
}
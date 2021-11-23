@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    android.util.Log.v(com.android.camera.VideoUI.TAG, ((("surfaceChanged: width = " + width) + ", height = ") + height));
    hidePreviewCover();
}
@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    try {
        play();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    if ((drawThread) == null) {
        return ;
    }
    drawThread.setSurfaceHolder(holder);
}
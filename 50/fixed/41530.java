@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    if (!(mInitSuccesful)) {
        initRecorder(mHolder.getSurface());
    }
}
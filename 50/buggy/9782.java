@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    android.util.Log.d("minko", "DummyCameraPreview.surfaceCreated");
    if (isActive())
        _callback.run(surfaceHolder);
    
}
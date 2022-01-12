@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    android.util.Log.d("minko", "DummyCameraPreview.surfaceChanged");
    if (isActive())
        _callback.run(surfaceHolder, i, i2, i3);
    
}
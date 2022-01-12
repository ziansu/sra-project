@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    android.util.Log.e("MainScreen", "SURFACE CREATED");
    android.view.Display display = ((android.view.WindowManager) (this.getSystemService(Context.WINDOW_SERVICE))).getDefaultDisplay();
    int rotation = display.getRotation();
    if ((rotation == (android.view.Surface.ROTATION_90)) || (rotation == (android.view.Surface.ROTATION_270)))
        landscapeIsNormal = true;
    else
        landscapeIsNormal = false;
    
    surfaceCreated = true;
    mCameraSurface = surfaceHolder.getSurface();
}
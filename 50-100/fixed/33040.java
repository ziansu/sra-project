@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    int orientation = getResources().getConfiguration().orientation;
    if ((camera) != null) {
        if (orientation == (android.content.res.Configuration.ORIENTATION_PORTRAIT)) {
            camera.setDisplayOrientation(90);
        }else
            if (orientation == (android.content.res.Configuration.ORIENTATION_LANDSCAPE)) {
                camera.setDisplayOrientation(0);
            }
        
    }
}
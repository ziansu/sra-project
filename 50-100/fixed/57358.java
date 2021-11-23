@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    int orientation = newConfig.orientation;
    if (orientation == (android.content.res.Configuration.ORIENTATION_PORTRAIT)) {
        rotateCamera(false);
    }else
        if (orientation == (android.content.res.Configuration.ORIENTATION_LANDSCAPE)) {
            rotateCamera(true);
        }
    
}
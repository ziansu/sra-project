@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    android.util.Log.d("tag", "config changed");
    super.onConfigurationChanged(newConfig);
    int orientation = newConfig.orientation;
    if (orientation == (android.content.res.Configuration.ORIENTATION_PORTRAIT)) {
        rotateCamera(false);
        android.util.Log.d("tag", "Portrait");
    }else
        if (orientation == (android.content.res.Configuration.ORIENTATION_LANDSCAPE)) {
            rotateCamera(true);
            android.util.Log.d("tag", "Landscape");
        }else
            android.util.Log.w("tag", ("other: " + orientation));
        
    
}
@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    android.util.Log.v("Activity", "onConfigurationChanged");
    android.util.Log.v("Configuration", java.lang.String.valueOf(newConfig.orientation));
    orientation = newConfig.orientation;
    onWindowFocusChanged(true);
}
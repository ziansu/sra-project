@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    orientation = newConfig.orientation;
    onWindowFocusChanged(true);
}
@android.annotation.SuppressLint(value = "InlinedApi")
public static void activateFullscreen(android.support.v7.app.AppCompatActivity activity, android.view.View view) {
    android.support.v7.app.ActionBar actionBar = activity.getSupportActionBar();
    if (actionBar != null) {
        actionBar.hide();
    }
    view.setSystemUiVisibility((((((android.view.View.SYSTEM_UI_FLAG_LOW_PROFILE) | (android.view.View.SYSTEM_UI_FLAG_FULLSCREEN)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)));
}
@android.annotation.TargetApi(value = Build.VERSION_CODES.KITKAT)
@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    int flags = (((android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_FULLSCREEN)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    if (hasFocus) {
        flags |= android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
    }
    getWindow().getDecorView().setSystemUiVisibility(flags);
}
@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    if (hasFocus) {
        if ((Build.VERSION.SDK_INT) >= 11) {
            android.view.View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility((((((android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)) | (android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_FULLSCREEN)));
        }
    }
}
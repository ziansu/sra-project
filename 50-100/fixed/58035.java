private static void setFullscreenMode(android.app.Activity activity) {
    android.util.Log.d(com.auth0.android.lock.utils.ActivityUIHelper.TAG, "Activity in fullscreen mode");
    final android.view.Window window = activity.getWindow();
    if ((Build.VERSION.SDK_INT) >= 16) {
        android.view.View decorView = window.getDecorView();
        int uiOptions = (android.view.View.SYSTEM_UI_FLAG_FULLSCREEN) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        decorView.setSystemUiVisibility(uiOptions);
    }else {
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
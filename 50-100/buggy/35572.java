@android.annotation.TargetApi(value = Build.VERSION_CODES.M)
static void setStatusBarColor(android.app.Activity activity, int color, boolean lightStatusBar) {
    android.view.Window window = activity.getWindow();
    window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
    window.setStatusBarColor(color);
    android.view.View decor = window.getDecorView();
    int ui = decor.getSystemUiVisibility();
    if (lightStatusBar) {
        ui |= android.view.View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
    }else {
        ui &= ~(android.view.View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
    }
    decor.setSystemUiVisibility(ui);
}
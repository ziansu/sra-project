boolean setStatusBarColor(int color) {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.KITKAT))
        return false;
    
    android.view.Window w = getWindow();
    w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
    w.setStatusBarColor(color);
    return true;
}
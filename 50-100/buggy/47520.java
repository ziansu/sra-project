private WindowManager.LayoutParams createDefaultLayoutParams(int type, @android.support.annotation.Nullable
android.os.IBinder windowToken) {
    android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
    layoutParams.format = android.graphics.PixelFormat.TRANSLUCENT;
    layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
    layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
    int gravity = (mSnackbarConfiguration.getGravity().equals(SnackbarConfiguration.Gravity.GRAVITY_TOP)) ? android.view.Gravity.TOP : android.view.Gravity.BOTTOM;
    layoutParams.gravity = android.support.v4.view.GravityCompat.getAbsoluteGravity(gravity, ViewCompat.LAYOUT_DIRECTION_LTR);
    layoutParams.flags = (WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE) | (WindowManager.LayoutParams.FLAG_LAYOUT_IN_OVERSCAN);
    layoutParams.token = windowToken;
    layoutParams.type = type;
    return layoutParams;
}
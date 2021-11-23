private static WindowManager.LayoutParams getSecondFloatWindowLayoutParmas(android.content.Context context) {
    android.view.WindowManager.LayoutParams lp = new android.view.WindowManager.LayoutParams();
    lp.type = WindowManager.LayoutParams.TYPE_SYSTEM_ERROR;
    lp.flags = ((WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED) | (WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL)) | (WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH);
    lp.format = android.graphics.PixelFormat.TRANSLUCENT;
    lp.width = WindowManager.LayoutParams.MATCH_PARENT;
    lp.height = WindowManager.LayoutParams.MATCH_PARENT;
    lp.gravity = android.view.Gravity.CENTER;
    return lp;
}
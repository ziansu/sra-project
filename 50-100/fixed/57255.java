public void addView(@android.support.annotation.NonNull
android.view.View view, @android.support.annotation.Nullable
android.view.WindowManager.LayoutParams params) {
    if (params == null)
        params = new android.view.WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
    
    params.flags = WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN;
    params.type = WindowManager.LayoutParams.TYPE_SYSTEM_OVERLAY;
    params.format = android.graphics.PixelFormat.TRANSLUCENT;
    windowManager.addView(view, params);
    views.add(view);
}
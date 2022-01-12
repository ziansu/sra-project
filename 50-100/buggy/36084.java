public static final android.graphics.Bitmap createBitmapFromPath(java.lang.String path, android.content.Context context) {
    android.view.WindowManager manager = ((android.view.WindowManager) (context.getSystemService(Context.WINDOW_SERVICE)));
    android.view.Display display = manager.getDefaultDisplay();
    int screenW = display.getWidth();
    int screenH = display.getHeight();
    return cn.forward.androids.utils.ImageUtils.createBitmapFromPath(path, context, screenW, screenH);
}
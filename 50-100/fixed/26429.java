public static com.donare.app.utils.Util.Resolution getScreenResolution(android.content.Context context) {
    android.view.WindowManager wm = ((android.view.WindowManager) (context.getSystemService(Context.WINDOW_SERVICE)));
    android.view.Display display = wm.getDefaultDisplay();
    android.util.DisplayMetrics metrics = new android.util.DisplayMetrics();
    display.getMetrics(metrics);
    int width = metrics.widthPixels;
    int height = metrics.heightPixels;
    return new com.donare.app.utils.Util.Resolution(width, height);
}
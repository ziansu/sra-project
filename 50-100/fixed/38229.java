private static int getScreenWidth(android.view.View view) {
    android.view.WindowManager manager = ((android.view.WindowManager) (view.getContext().getSystemService(Context.WINDOW_SERVICE)));
    android.view.Display display = manager.getDefaultDisplay();
    int deviceWidth;
    android.graphics.Point point = new android.graphics.Point();
    display.getSize(point);
    deviceWidth = point.x;
    return deviceWidth;
}
private void getScreenSize() {
    android.view.WindowManager wm = ((android.view.WindowManager) (getContext().getSystemService(Context.WINDOW_SERVICE)));
    android.view.Display display = wm.getDefaultDisplay();
    android.graphics.Point size = new android.graphics.Point();
    display.getSize(size);
    widthOfSreen = size.x;
    heightOfScreen = size.y;
}
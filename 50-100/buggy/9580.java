private void setToolbarColor(android.support.v7.graphics.Palette palette) {
    int defaultDarkColor = android.support.v4.content.ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        android.view.Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(palette.getDarkVibrantColor(defaultDarkColor));
    }
}
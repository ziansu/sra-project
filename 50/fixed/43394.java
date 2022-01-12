private android.view.View setSystemUiVisilityMode() {
    android.view.View decorView = getWindow().getDecorView();
    int options;
    options = android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
    decorView.setSystemUiVisibility(options);
    return decorView;
}
public com.azzarcher.colormanager.ColorManager setStatusBarColor(android.view.Window window, int statusBarColor) {
    window.setStatusBarColor(mStatusBarColor);
    mWindow = window;
    mStatusBarColor = statusBarColor;
    return this;
}
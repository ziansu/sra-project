public final void styleApplication(int color, int darkColor) {
    currentColor = color;
    currentColorDark = darkColor;
    toolbar.setBackgroundColor(color);
    toolbarExtension.setBackgroundColor(color);
    toolbarExtensionPlaceHolder.setBackgroundColor(color);
    if ((android.os.Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        android.view.Window window = getWindow();
        window.setNavigationBarColor(color);
        window.setStatusBarColor(darkColor);
    }
}
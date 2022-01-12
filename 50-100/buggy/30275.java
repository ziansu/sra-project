public final void styleApplication(java.lang.Integer color, java.lang.Integer darkColor) {
    if ((color == null) || (darkColor == null)) {
        return ;
    }
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
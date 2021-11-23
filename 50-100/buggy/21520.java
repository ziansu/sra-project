public void setStyle(com.reactnativenavigation.core.objects.Screen screen) {
    mButtonsTintColor = screen.navBarButtonColor;
    if ((screen.toolBarColor) != null) {
        setBackgroundColor(screen.toolBarColor);
    }else {
        resetBackground();
    }
    if ((screen.navBarTextColor) != null) {
        setTitleTextColor(screen.navBarTextColor);
    }else {
        resetTitleTextColor();
    }
    if (((screen.toolBarHidden) != null) && (screen.toolBarHidden)) {
        hideToolbar();
    }else {
        showToolbar();
    }
}
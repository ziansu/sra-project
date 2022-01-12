public static int getStatusBarHeight() {
    int result = 0;
    int resId = com.softdesign.devintensive.utils.App.get().getResources().getIdentifier("status_bar_height", "dimen", "android");
    if (resId > 0) {
        result = com.softdesign.devintensive.utils.App.get().getResources().getDimensionPixelSize(resId);
    }
    return result;
}
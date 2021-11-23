private static int getStatusBarHeight(android.app.Activity activity) {
    int statusBarHeight = 0;
    android.content.res.Resources res = activity.getResources();
    int resourceId = res.getIdentifier("status_bar_height", "dimen", "android");
    if (resourceId > 0) {
        statusBarHeight = res.getDimensionPixelSize(resourceId);
    }
    return statusBarHeight;
}
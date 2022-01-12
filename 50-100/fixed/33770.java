private static int getStatusBarHeight(android.content.Context context) {
    int statusBarHeight = 0;
    android.content.res.Resources res = context.getResources();
    int resourceId = res.getIdentifier("status_bar_height", "dimen", "android");
    if (resourceId > 0) {
        statusBarHeight = res.getDimensionPixelSize(resourceId);
    }
    return statusBarHeight;
}
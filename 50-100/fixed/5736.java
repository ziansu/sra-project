public static int getStatusBarHeight(android.content.Context context) {
    int result = 0;
    int resId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
    if (resId > 0) {
        result = context.getResources().getDimensionPixelSize(resId);
    }
    return result;
}
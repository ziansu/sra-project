private int getNavigationBarOffset() {
    int result = 0;
    android.content.res.Resources resources = mHoldingActivity.getResources();
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        int resourceId = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = resources.getDimensionPixelSize(resourceId);
        }
    }
    return result;
}
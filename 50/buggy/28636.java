public float getToolbarPaddingTop() {
    if ((mToolbarPaddingTop) >= 0) {
        return mToolbarPaddingTop;
    }
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
        mToolbarPaddingTop = 25;
    }else {
        mToolbarPaddingTop = 0;
    }
    return mToolbarPaddingTop;
}
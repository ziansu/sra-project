private void offsetPreviousSnapshot(float translateX) {
    android.view.View view = getPreviousActivityContentView();
    if (view == null) {
        throw new java.lang.NullPointerException("NullPointerException");
    }
    if ((mSlideFrameLayout) != null) {
        if (!(mPreviousActivitySlideFollow)) {
            translateX = 0;
        }
        mSlideFrameLayout.offsetPreviousSnapshot(view, translateX);
    }
}
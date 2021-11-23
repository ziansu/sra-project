private int scroll(android.view.View view, int dy) {
    int newTop = (view.getTop()) - dy;
    if (newTop >= (mOriginalTop)) {
        newTop = mOriginalTop;
    }
    if (newTop < ((mOriginalTop) - (mAppBarLayout.getTotalScrollRange()))) {
        newTop = (mOriginalTop) - (mAppBarLayout.getTotalScrollRange());
    }
    return setTopBottomOffset(view, (newTop - (mOriginalTop)));
}
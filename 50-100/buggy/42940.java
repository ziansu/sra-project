public int getCurrentPosition() {
    int curPosition = -1;
    if (getLayoutManager().canScrollHorizontally()) {
        curPosition = com.lsjwzh.widget.recyclerviewpager.ViewUtils.getCenterXChildPosition(this);
    }else {
        curPosition = com.lsjwzh.widget.recyclerviewpager.ViewUtils.getCenterYChildPosition(this);
    }
    if (curPosition < 0) {
        curPosition = mSmoothScrollTargetPosition;
    }
    return curPosition;
}
public int getScrollY() {
    android.view.View c = mListView.getChildAt(0);
    if (c == null) {
        return 0;
    }
    int firstVisiblePosition = mListView.getFirstVisiblePosition();
    int top = c.getTop();
    int headerHeight = 0;
    if (firstVisiblePosition >= 1) {
        headerHeight = mFakeHeader.getHeight();
    }
    return ((-top) + (firstVisiblePosition * (c.getHeight()))) + headerHeight;
}
public int getScrollY() {
    android.view.View c = mListView.getChildAt(0);
    if (c == null) {
        return 0;
    }
    int firstVisiblePosition = mListView.getFirstVisiblePosition();
    int top = c.getTop();
    if (firstVisiblePosition >= 1) {
        return mFakeHeader.getHeight();
    }
    return -top;
}
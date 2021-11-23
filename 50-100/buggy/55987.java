private boolean isBottom() {
    if ((mListView.getCount()) > 0) {
        if (((mListView.getLastVisiblePosition()) == ((mListView.getAdapter().getCount()) - 1)) && ((mListView.getChildAt(((mListView.getChildCount()) - 1)).getBottom()) <= (mListView.getHeight()))) {
            return true;
        }
    }
    return false;
}
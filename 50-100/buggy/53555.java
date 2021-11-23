public void onScrollStateChanged(android.widget.AbsListView view, int scrollState) {
    if (scrollState == (android.widget.AbsListView.OnScrollListener.SCROLL_STATE_IDLE)) {
        mCoinSlotAdapter.notifyDataSetChanged();
        this.isListScrolling = false;
    }else {
        this.isListScrolling = true;
    }
    android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
}
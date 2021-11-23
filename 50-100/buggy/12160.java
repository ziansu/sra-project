@java.lang.Override
public void onScrollStateChanged(android.widget.AbsListView view, int scrollState) {
    if ((lastVisibleItem) <= 1) {
        return ;
    }
    if (((lastVisibleItem) == (totalItemCount)) && (scrollState == (SCROLL_STATE_IDLE))) {
        if (!(isLoading)) {
            isLoading = true;
            footerView.setVisibility(View.VISIBLE);
            onLoadListener.onLoad();
        }
    }
}
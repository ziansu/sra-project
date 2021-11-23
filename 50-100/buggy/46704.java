@java.lang.Override
public void onScrollStateChanged(android.widget.AbsListView view, int scrollState) {
    switch (scrollState) {
        case android.widget.AbsListView.OnScrollListener.SCROLL_STATE_IDLE :
            scrollFlag = false;
            if ((listView.getLastVisiblePosition()) == ((listView.getCount()) - 1)) {
            }
            if ((listView.getFirstVisiblePosition()) == 0) {
            }
            break;
        case android.widget.AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL :
            android.util.Log.d("DEBUG", "scrolling");
            scrollFlag = true;
            break;
        case android.widget.AbsListView.OnScrollListener.SCROLL_STATE_FLING :
            scrollFlag = false;
            break;
        default :
            break;
    }
}
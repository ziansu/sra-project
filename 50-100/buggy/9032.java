@java.lang.Override
public void onScrollStateChanged(android.widget.AbsListView view, int scrollState) {
    switch (scrollState) {
        case AbsListView.OnScrollListener.SCROLL_STATE_IDLE :
            if ((view.getLastVisiblePosition()) == ((view.getCount()) - 1)) {
                zhenghaiqiang.com.wynews.utils.Util.toast(mActivity, "到底");
                (page)++;
                totalUrl = (baseUrl) + (getPageValue(page));
                getData();
            }
            break;
    }
}
@java.lang.Override
public void onRefresh() {
    if (!(onLoading)) {
        final org.garywzh.quumiibox.ui.loader.ItemListLoader loader = getLoader();
        if (loader == null) {
            return ;
        }
        mCount = 0;
        mItems.clear();
        loader.setPage(((mCount) + 1));
    }
}
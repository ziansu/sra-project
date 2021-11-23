@java.lang.Override
public void onRefresh() {
    if (!(onLoading)) {
        final org.garywzh.quumiibox.ui.loader.ItemListLoader loader = getLoader();
        if (loader == null) {
            return ;
        }
        onLoading = true;
        mCount = 0;
        loader.setPage(((mCount) + 1));
    }
}
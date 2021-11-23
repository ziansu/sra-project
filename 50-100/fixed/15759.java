private void updateListViewVisibility() {
    final android.support.v17.leanback.widget.VerticalGridView listView = getVerticalGridView();
    if (listView != null) {
        getView().setVisibility((mHeadersGone ? android.view.View.GONE : android.view.View.VISIBLE));
        if (!(mHeadersGone)) {
            if (mHeadersEnabled) {
                listView.setChildrenVisibility(View.VISIBLE);
            }else {
                listView.setChildrenVisibility(View.INVISIBLE);
            }
        }
    }
}
@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    lastItem = firstVisibleItem + visibleItemCount;
    if ((!(footerViewLoadingVisiable)) && (totalItemCount > visibleItemCount)) {
        adviceListView.addFooterView(footerViewLoading);
        adviceListView.setFooterDividersEnabled(false);
        footerViewLoadingVisiable = true;
    }
}
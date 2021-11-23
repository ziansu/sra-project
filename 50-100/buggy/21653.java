@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    lastItem = firstVisibleItem + visibleItemCount;
    android.util.Log.d(com.smart.travel.AdviceFragment.TAG, ((((("onScroll callback: " + firstVisibleItem) + ", ") + visibleItemCount) + ", ") + (lastItem)));
    if ((!(footerViewLoadingVisiable)) && (totalItemCount > visibleItemCount)) {
        adviceListView.addFooterView(footerViewLoading);
        adviceListView.setFooterDividersEnabled(false);
        footerViewLoadingVisiable = true;
    }
}
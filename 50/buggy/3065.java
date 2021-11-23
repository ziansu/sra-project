@java.lang.Override
public void onRefresh() {
    swipeRefreshLayout.setRefreshing(true);
    ((com.rotem.showme.MainActivity) (getActivity())).refreshSeries();
}
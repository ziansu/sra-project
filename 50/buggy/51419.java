@java.lang.Override
public void onPause() {
    super.onPause();
    mSwipeRefreshLayout.setRefreshing(false);
    mReceiver.disable();
    mListView.setAdapter(null);
}
private void initOrUpdateAdapter() {
    historyClipRealmResults = realm.where(com.abara.fireclip.util.HistoryClip.class).findAllSorted("timestamp", Sort.DESCENDING);
    if ((historyClipRealmResults.size()) != 0) {
        historyEmptyView.setVisibility(View.GONE);
        historyList.setAdapter(historyAdapter);
    }else {
        historyEmptyView.setVisibility(View.VISIBLE);
        historyList.setAdapter(null);
    }
}
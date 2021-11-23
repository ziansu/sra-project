public void setHistoryList(java.util.List<com.rainbow.kam.bt_scanner.data.item.RealmPrimeItem> results) {
    historyArrayList.clear();
    historyArrayList.addAll(results);
    java.util.Collections.reverse(historyArrayList);
    notifyDataSetChanged();
}
@java.lang.Override
public void onSuccess(java.lang.String response) {
    org.jsoup.nodes.Document document = org.jsoup.Jsoup.parse(response);
    final java.util.ArrayList<com.adrastel.niviel.models.readable.history.History> histories = com.adrastel.niviel.providers.HistoryProvider.getHistory(document);
    activity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            adapter.refreshData(makeExpandedArrayList(histories));
        }
    });
}
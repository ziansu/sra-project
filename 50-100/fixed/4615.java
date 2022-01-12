@java.lang.Override
public void onResponse(retrofit2.Call<java.util.List<com.extinctspecie.betman.models.HistoryItem>> call, retrofit2.Response<java.util.List<com.extinctspecie.betman.models.HistoryItem>> response) {
    historyItems = response.body();
    if ((historyItems.size()) > 0) {
        lvAdapterHistory = new com.extinctspecie.betman.LVAdapterTVHistory(getActivity().getBaseContext(), historyItems);
        listView.setAdapter(lvAdapterHistory);
    }
    tvHistoryProgress.setVisibility(View.GONE);
}
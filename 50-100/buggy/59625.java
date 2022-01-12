void bindView(android.view.View v) {
    mHistoryList = ((android.support.v7.widget.RecyclerView) (v.findViewById(R.id.history_list)));
    layoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity());
    layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
    mHistoryList.setLayoutManager(layoutManager);
    historyListAdapter = new adapters.HistoryListAdapter(db.getAllDestination(), getActivity(), new android.location.Geocoder(getActivity(), java.util.Locale.getDefault()));
    mHistoryList.setAdapter(historyListAdapter);
    historyListAdapter.notifyDataSetChanged();
}
public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {
    android.util.Log.d(TAG, "onCheckedChanged: button clicked, refreshing adapter");
    adapter = new org.example.team_pigeon.movie_pigeon.adapters.NowShowingListAdapter(weekList.get(dateIdMap.get(checkedId)), getActivity());
    scheduleListView.setAdapter(adapter);
    adapter.notifyDataSetChanged();
}
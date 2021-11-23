public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {
    android.widget.RadioButton checkedRadioButton = ((android.widget.RadioButton) (group.findViewById(checkedId)));
    boolean isChecked = checkedRadioButton.isChecked();
    if (isChecked) {
        android.util.Log.d(TAG, "onCheckedChanged: button clicked, refreshing adapter");
        adapter = new org.example.team_pigeon.movie_pigeon.adapters.NowShowingListAdapter(weekList.get(dateIdMap.get(checkedId)), getActivity());
        scheduleListView.setAdapter(adapter);
        ((org.example.team_pigeon.movie_pigeon.adapters.NowShowingListAdapter) (scheduleListView.getAdapter())).notifyDataSetChanged();
    }
}
@java.lang.SuppressWarnings(value = "unused")
public void onEventMainThread(com.projects.nosleepproject.events.ListingLoadedEvent event) {
    mValuesArray = event.getValues();
    mAfter = event.getAfter();
    if (firstRun) {
        mAdapter = new com.projects.nosleepproject.ListViewAdapter(this, mValuesArray);
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(this);
        mListView.setOnScrollListener(this);
        loadingPanel.setVisibility(View.GONE);
        firstRun = false;
    }else {
        mAdapter.notifyDataSetChanged();
        loadingPanel.setVisibility(View.GONE);
    }
}
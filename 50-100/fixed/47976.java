@java.lang.SuppressWarnings(value = "unused")
public void onEventMainThread(com.projects.nosleepproject.events.QueryListingEvent event) {
    mValuesArray = event.getValuesArray();
    mAdapter = new com.projects.nosleepproject.ListViewAdapter(this, mValuesArray);
    mListView.setAdapter(mAdapter);
    mListView.setOnItemClickListener(this);
    mListView.setOnScrollListener(this);
    if ((mPosition) != (android.widget.ListView.INVALID_POSITION))
        mListView.setSelection(mPosition);
    
    loadingPanel.setVisibility(View.GONE);
    firstRun = false;
}
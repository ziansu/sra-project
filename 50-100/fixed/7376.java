@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    myEvents.clear();
    sortData(eventbriteEvents);
    myEvents.addAll(eventbriteEvents);
    sortData(eventfulEvents);
    myEvents.addAll(eventfulEvents);
    mAdapter = new com.festivent.hardeep.festivent.ListAdapter(this, myEvents, sEvents, true);
    mRecyclerView.setAdapter(mAdapter);
    pBar.setVisibility(View.GONE);
    super.onPostExecute(aVoid);
}
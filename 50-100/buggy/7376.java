@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    myEvents.clear();
    myEvents.addAll(eventbriteEvents);
    myEvents.addAll(eventfulEvents);
    sortData();
    mAdapter = new com.festivent.hardeep.festivent.ListAdapter(this, myEvents, sEvents, true);
    mRecyclerView.setAdapter(mAdapter);
    pBar.setVisibility(View.GONE);
    super.onPostExecute(aVoid);
}
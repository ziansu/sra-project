@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    mRegionTitle = ((android.widget.TextView) (findViewById(R.id.regionTitle)));
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.recyclerView)));
    setContentView(R.layout.activity_meeting_list);
    final java.lang.String searchRegion = userRegion.getQuery().toString();
    mRecentRegion = searchRegion.replaceAll("[^A-Za-z]+", "").toLowerCase();
    mRegionTitle.setText(searchRegion);
    setUpFirebaseAdapter();
    mRecyclerView.setAdapter(mFirebaseAdapter);
    return false;
}
@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    final java.lang.String searchRegion = userRegion.getQuery().toString();
    mRecentRegion = searchRegion.replaceAll("[^A-Za-z]+", "").toLowerCase();
    mRegionTitle.setText(searchRegion);
    setUpFirebaseAdapter();
    mRecyclerView.setAdapter(mFirebaseAdapter);
    return false;
}
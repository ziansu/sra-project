public void onDataReceived(com.jacks205.spots.model.ParkingStructure[] structures, java.util.Date lastUpdated) {
    if ((spotsListAdapter) == null) {
        spotsListAdapter = new com.jacks205.spots.adapters.SpotsListAdapter(this, structures, lastUpdated);
        listView.setAdapter(spotsListAdapter);
    }else {
        spotsListAdapter.setStructures(structures);
        spotsListAdapter.setLastUpdated(lastUpdated);
        spotsListAdapter.notifyDataSetChanged();
    }
    mSwipeRefreshLayout.setRefreshing(false);
}
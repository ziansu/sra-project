public void onDataReceived(com.jacks205.spots.model.ParkingStructure[] structures) {
    if ((spotsListAdapter) == null) {
        spotsListAdapter = new com.jacks205.spots.adapters.SpotsListAdapter(this, structures);
        listView.setAdapter(spotsListAdapter);
    }else {
        spotsListAdapter.setStructures(structures);
        spotsListAdapter.notifyDataSetChanged();
    }
    mSwipeRefreshLayout.setRefreshing(false);
}
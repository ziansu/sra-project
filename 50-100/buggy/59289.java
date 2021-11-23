public void updateList() {
    if ((((myAdapter) == null) || ((myDataSource) == null)) || ((myDataSource.size()) == 0)) {
        myDataSource = net.unitecgroup.parking.demoapi.util.ControllerAPI.getMyDataSource();
        myAdapter = new net.unitecgroup.parking.demoapi.adapter.ParkingSpaceListAdapter(myDataSource, R.layout.item_list_parking_text, getContext());
    }
    if ((mRecyclerView) != null) {
        mRecyclerView.setAdapter(myAdapter);
    }
    myAdapter.notifyDataSetChanged();
}
public void reloadData() {
    android.util.Log.d(TAG, "reloadData");
    if (false == (com.taxibutler.tb3.model.DataModel.instance().trips.isEmpty())) {
        android.util.Log.d("trips", com.taxibutler.tb3.model.DataModel.instance().trips.toString());
        adapter.notifyDataSetChanged();
        tripListView.setVisibility(View.VISIBLE);
        tripListView.bringToFront();
    }
}
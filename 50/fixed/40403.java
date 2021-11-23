private void HandleProcessingStatus() {
    if (mIsProcessing) {
        mActiveTrip = new sw10.ubiforsikring.TripListEntry(false, true);
        mTripList.add(0, mActiveTrip);
        mTripListAdapter.notifyDataSetChanged();
    }
}
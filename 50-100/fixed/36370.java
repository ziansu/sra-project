@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.location.Location location = intent.getParcelableExtra(getString(R.string.BroadcastLiveGpsLocation));
    com.google.android.gms.maps.model.LatLng position = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
    if ((mPreviousPosition) != null) {
        mActiveTrip.Distance += DistanceBetweenLatLng(position, mPreviousPosition);
        mTripOverviewAdapter.notifyDataSetChanged();
        mPreviousPosition = position;
    }
}
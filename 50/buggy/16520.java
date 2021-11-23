private void registerForLocationUpdates() {
    com.teamagam.gimelgimel.app.model.ViewsModels.MessageBroadcastReceiver.registerReceiver(getActivity(), mUserLocationReceiver);
    mLocationFetcher = com.teamagam.gimelgimel.app.control.sensors.LocationFetcher.getInstance(getActivity());
    mLocationFetcher.registerReceiver(mLocationReceiver);
}
private void activateGeofences() {
    android.util.Log.v(com.ngynstvn.android.blocspot.ui.fragment.MapsFragment.TAG, "activateGeofences() called");
    LocationServices.GeofencingApi.addGeofences(googleApiClient, getGeofencingRequest(), getGeofencePendingIntent()).setResultCallback(this);
}
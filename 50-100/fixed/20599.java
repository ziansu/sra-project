@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
    if ((mLastLocation) != null) {
        if (!(android.location.Geocoder.isPresent())) {
            return ;
        }
        if ((mapFragment) != null) {
            mapFragment.getMapAsync(this);
        }
    }
}
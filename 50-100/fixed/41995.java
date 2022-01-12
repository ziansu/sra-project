@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.location.LocationSettingsResult result) {
    final com.google.android.gms.common.api.Status status = result.getStatus();
    switch (status.getStatusCode()) {
        case com.google.android.gms.location.LocationSettingsStatusCodes.SUCCESS :
            startLocationUpdates();
            break;
        case com.google.android.gms.location.LocationSettingsStatusCodes.RESOLUTION_REQUIRED :
            try {
                status.startResolutionForResult(this, com.owsega.hellotractorsample.FarmerDetailsActivity.REQUEST_CHECK_SETTINGS);
            } catch (android.content.IntentSender e) {
            }
            break;
        case com.google.android.gms.location.LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE :
            break;
    }
}
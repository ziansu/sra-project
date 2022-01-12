@java.lang.Override
public void onFailure(@android.support.annotation.NonNull
java.lang.Exception e) {
    final int statusCode = ((com.google.android.gms.common.api.ApiException) (e)).getStatusCode();
    switch (statusCode) {
        case com.google.android.gms.location.LocationSettingsStatusCodes.RESOLUTION_REQUIRED :
            try {
                com.google.android.gms.common.api.ResolvableApiException rae = ((com.google.android.gms.common.api.ResolvableApiException) (e));
                throw new android.content.IntentSender.SendIntentException();
            } catch (android.content.IntentSender sendEx) {
            }
            break;
        case com.google.android.gms.location.LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE :
            setRequestingLocationUpdates(false, R.string.error_inadequate_location_settings);
    }
}
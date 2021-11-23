@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.location.LocationSettingsResult result) {
    final com.google.android.gms.common.api.Status status = result.getStatus();
    switch (status.getStatusCode()) {
        case com.google.android.gms.location.LocationSettingsStatusCodes.SUCCESS :
            getCurrentCountry();
            break;
        case com.google.android.gms.location.LocationSettingsStatusCodes.RESOLUTION_REQUIRED :
            try {
                status.startResolutionForResult(this, com.yatrashare.activities.SplashActivity.REQUEST_CHECK_SETTINGS);
            } catch (android.content.IntentSender e) {
                e.printStackTrace();
            }
            break;
        case com.google.android.gms.location.LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE :
            getCurrentCountry();
            break;
    }
}
private boolean hasPlay() {
    int result;
    try {
        result = com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
    } catch (java.lang.Exception e) {
        return false;
    }
    return result == (com.google.android.gms.common.ConnectionResult.SUCCESS);
}
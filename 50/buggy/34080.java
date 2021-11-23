private boolean hasPlay() {
    boolean res = false;
    try {
        res = (com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context)) != (com.google.android.gms.common.ConnectionResult.SUCCESS);
    } catch (java.lang.Exception e) {
    }
    return res;
}
@java.lang.Override
@java.lang.SafeVarargs
protected final java.lang.Boolean doInBackground(com.google.android.gms.common.api.PendingResult<com.google.android.gms.location.LocationSettingsResult>... pendingResults) {
    de.bahnhoefe.deutschlands.bahnhofsfotos.Status status = pendingResults[0].await().getStatus();
    int statusCode = status.getStatusCode();
    return (statusCode == (com.google.android.gms.location.LocationSettingsStatusCodes.SUCCESS)) || (statusCode == (com.google.android.gms.location.LocationSettingsStatusCodes.SUCCESS_CACHE));
}
private boolean checkPlayServices() {
    com.google.android.gms.common.GoogleApiAvailability apiAvailability = com.google.android.gms.common.GoogleApiAvailability.getInstance();
    int resultCode = apiAvailability.isGooglePlayServicesAvailable(getContext());
    if (resultCode != (com.google.android.gms.common.ConnectionResult.SUCCESS)) {
        if (apiAvailability.isUserResolvableError(resultCode)) {
            apiAvailability.getErrorDialog(getActivity(), resultCode, com.udacity.stockhawk.fragments.StockFragment.PLAY_SERVICES_RESOLUTION_REQUEST).show();
        }else {
            android.util.Log.i(com.github.mikephil.charting.charts.Chart.LOG_TAG, "This device is not supported.");
            finish();
        }
        return false;
    }
    return true;
}
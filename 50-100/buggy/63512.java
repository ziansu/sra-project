@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    mShouldResolve = false;
    try {
        showSignedInUI();
    } catch (java.lang.NullPointerException e) {
        e.printStackTrace();
    }
    if (isLocationEnabled()) {
        try {
            br.edu.ufcg.analytics.meliorbusao.activities.MelhorBusaoActivity.requestingLocationDialog = android.app.ProgressDialog.show(this, getString(R.string.requesting_location), getString(R.string.wait_message), true);
        } catch (java.lang.Exception e) {
            android.util.Log.e(br.edu.ufcg.analytics.meliorbusao.activities.MelhorBusaoActivity.TAG, e.getMessage());
        }
        startLocationUpdates();
    }else {
        buildAlertMessageNoGps();
    }
}
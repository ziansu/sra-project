@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    mShouldResolve = false;
    try {
        showSignedInUI();
    } catch (java.lang.NullPointerException e) {
        e.printStackTrace();
    }
    if (isLocationEnabled()) {
        startLocationUpdates();
    }else {
        buildAlertMessageNoGps();
    }
}
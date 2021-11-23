@java.lang.Override
public void onConnected(final android.os.Bundle bundle) {
    android.util.Log.d(s.pahlplatz.fhict_companion.views.activities.LoginActivity.TAG, "onConnected: Requesting credentials.");
    requestCredentials();
}
public void onRevokeAccessClick(android.view.View view) {
    android.widget.Toast.makeText(this, "onRevokeAccessClick", Toast.LENGTH_SHORT).show();
    boolean isConnecting = googleApiClient.isConnecting();
    android.util.Log.e(com.sarahehabm.carbcalculator.login.LoginActivity.TAG, ("onRevokeAccessClick; client.isConnecting()= " + isConnecting));
    if (!isConnecting) {
        Plus.AccountApi.clearDefaultAccount(googleApiClient);
        Plus.AccountApi.revokeAccessAndDisconnect(googleApiClient);
        googleApiClient = buildApiClient();
        googleApiClient.connect();
    }
}
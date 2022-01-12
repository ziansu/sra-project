private void getResultsFromApi() {
    if (!(isGooglePlayServicesAvailable())) {
        acquireGooglePlayServices();
    }else
        if ((credential.getSelectedAccountName()) == null) {
            chooseAccount();
        }else
            if (!(isDeviceOnline())) {
                android.util.Log.i(kelvinycchan.a12googlesheetcheck_insystem.CheckInActivity.TAG, "No network connection available.");
                android.widget.Toast.makeText(this, "No network connection available.", Toast.LENGTH_LONG).show();
            }else {
                new kelvinycchan.a12googlesheetcheck_insystem.CheckInActivity.MakeRequestTask(credential).execute();
            }
        
    
}
@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    gps = new com.skyrealm.brockyy.findmypeepsapp.GPSTracker(this);
    pDialog = new android.app.ProgressDialog(this);
    pDialog.setMessage("Sharing your location...");
    pDialog.setIndeterminate(false);
    pDialog.setCancelable(false);
    pDialog.show();
}
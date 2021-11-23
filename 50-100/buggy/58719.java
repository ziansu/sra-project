void onScanStart() {
    android.util.Log.v("DIALOG", "Start scanning");
    mScanBtn.setText("Cancel scan");
    mServersSpinner.setVisibility(View.GONE);
    mServersSpinner.setEnabled(false);
    mScanProgressBar.setProgress(0);
    mScanProgressBar.setVisibility(View.VISIBLE);
    mScanProgressBar.setEnabled(true);
    mServerAddressEditText.setEnabled(false);
    mScanTask = new uk.org.ngo.squeezer.dialogs.ServerAddressPreference.scanNetworkTask();
    mScanTask.execute();
    mScanInProgress = true;
}
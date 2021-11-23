@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if (isFinishing()) {
        mGoogleApiClient = null;
        if ((customThreadCheckLocation) != null)
            customThreadCheckLocation.stopRunning(false);
        
        if ((customThreadCheckGPSState) != null)
            customThreadCheckGPSState.stopRunning(false);
        
        android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(receiverMaps);
    }
}
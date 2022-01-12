@java.lang.Override
protected void onDestroy() {
    android.util.Log.i(com.givenhansco.keystonenavigation.Activities.KODUserFunctions.LoginActivity.TAG, "onDestroy called.");
    super.onDestroy();
    if ((voiceService) != null) {
        voiceService.setListener(null);
        voiceService = null;
    }
    if ((mConnection) != null) {
        unbindService(mConnection);
        mConnection = null;
    }
}
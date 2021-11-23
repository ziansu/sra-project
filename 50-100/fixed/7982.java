private void invokeFCMService() {
    android.util.Log.d(com.lognsys.kalrav.LoginActivity.TAG, "Rest invokeFCMService ");
    if ((com.lognsys.kalrav.util.KalravApplication.getInstance().getPrefs().getDevice_token()) == null) {
        android.content.Intent i = new android.content.Intent(this, com.lognsys.kalrav.FCM.FCMInstanceIdService.class);
        startService(i);
    }
    android.util.Log.d(com.lognsys.kalrav.LoginActivity.TAG, ("Rest invokeFCMService KalravApplication.getInstance().getPrefs().getDevice_token() " + (com.lognsys.kalrav.util.KalravApplication.getInstance().getPrefs().getDevice_token())));
}
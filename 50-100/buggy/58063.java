@java.lang.Override
protected void onStart() {
    super.onStart();
    activityStartCount = gameBase.getInt(ArithmosGameBase.MAIN_START_COUNT, 1);
    gameBase.putInt(ArithmosGameBase.MAIN_START_COUNT, (++(activityStartCount)));
    android.util.Log.d(com.nakedape.arithmos.MainActivity.LOG_TAG, ("MAIN_START_COUNT = " + (activityStartCount)));
    cacheGame();
    showAds();
    if (mAutoStartSignInFlow)
        mGoogleApiClient.connect();
    
}
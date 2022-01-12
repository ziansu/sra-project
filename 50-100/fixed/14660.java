@java.lang.Override
public void onDestroy() {
    com.crashlytics.android.Crashlytics.log(Log.INFO, com.jakehilborn.speedr.MainService.class.getSimpleName(), "onDestroy()");
    persistTimeSaved(statsCalculator.getTimeSaved(), statsCalculator.getFirstLimitTime());
    notificationManager.cancel(com.jakehilborn.speedr.MainService.NOTIFICATION_ID);
    notificationManager = null;
    limitFetcher.destroy(this);
    if ((googleApiClient) != null)
        googleApiClient.disconnect();
    
    super.onDestroy();
}
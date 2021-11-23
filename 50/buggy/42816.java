@java.lang.Override
protected void onResume() {
    super.onResume();
    com.facebook.appevents.AppEventsLogger.activateApp(this);
    if (!(isInternetEnabled()))
        buildAlertMessageNoInternet();
    else {
        cwa115.trongame.Service.AppReceiver.scheduleService(this);
    }
    updateUI();
}
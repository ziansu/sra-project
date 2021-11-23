private void startNotificationServer() {
    android.content.Intent serviceIntent = new android.content.Intent(this, mapper.mobile.om.mobilemapper.service.MobileNotificationService.class);
    if (!(isMyServiceRunning(mapper.mobile.om.mobilemapper.service.MobileNotificationService.class))) {
        android.util.Log.d(this.getClass().getSimpleName(), "MobileNotificationService Service is not Running so Starting");
        serviceIntent.setAction(Constants.ACTION.STARTFOREGROUND_ACTION);
        mapper.mobile.om.mobilemapper.service.MobileNotificationService.IS_SERVICE_RUNNING = true;
        startService(serviceIntent);
    }
}
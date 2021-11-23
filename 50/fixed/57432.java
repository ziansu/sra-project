public void onResume() {
    Log_d(LOG_TAG, "onResume");
    if (org.durka.hallmonitor_framework_test.NotificationService.registerOnNotificationChangedListener(this))
        onNotificationChanged();
    
    updateBatteryStatus();
    new org.durka.hallmonitor_framework_test.ComponentDefaultHabeIchVergessen.GetCameraThread().start();
}
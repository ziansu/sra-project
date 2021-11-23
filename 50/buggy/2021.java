public final void stopIndoorOutdoorDetector() {
    org.mygeotrust.indoor.tasks.detectIndoorOutdoor.IndoorOutdoorDetectorController.activityContext.unregisterReceiver(currentStatusReceiver);
    org.mygeotrust.indoor.tasks.detectIndoorOutdoor.IndoorOutdoorDetectorController.activityContext.unregisterReceiver(wifiInfoReceiver);
    org.mygeotrust.indoor.tasks.detectIndoorOutdoor.IndoorOutdoorDetectorController.activityContext.stopService(new android.content.Intent(org.mygeotrust.indoor.tasks.detectIndoorOutdoor.IndoorOutdoorDetectorController.activityContext, org.mygeotrust.indoor.tasks.detectIndoorOutdoor.algorithm.DetermineIndoorOutdoorService.class));
}
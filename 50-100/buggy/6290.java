private void toggleCollecting(boolean enable) {
    if ((!(com.adsamcik.signalcollector.Services.TrackerService.isActive)) || ((com.adsamcik.signalcollector.Services.TrackerService.isActive) == enable))
        return ;
    
    if (checkAllTrackingPermissions()) {
        if (!(com.adsamcik.signalcollector.Services.TrackerService.isActive)) {
            android.content.Intent trackerService = new android.content.Intent(com.adsamcik.signalcollector.MainActivity.instance, com.adsamcik.signalcollector.Services.TrackerService.class);
            trackerService.putExtra("approxSize", com.adsamcik.signalcollector.DataStore.sizeOfData());
            startService(trackerService);
            com.adsamcik.signalcollector.Services.TrackerService.service = trackerService;
        }else {
            stopService(TrackerService.service);
        }
    }
}
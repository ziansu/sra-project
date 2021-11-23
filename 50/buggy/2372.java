private void exitApp() {
    com.labs.dm.auto_tethering.activity.Intent serviceIntent = new com.labs.dm.auto_tethering.activity.Intent(this, com.labs.dm.auto_tethering.service.TetheringService.class);
    stopService(serviceIntent);
    finish();
}
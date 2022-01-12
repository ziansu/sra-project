private void exitApp() {
    android.content.Intent serviceIntent = new android.content.Intent(this, com.labs.dm.auto_tethering.service.TetheringService.class);
    stopService(serviceIntent);
    finish();
}
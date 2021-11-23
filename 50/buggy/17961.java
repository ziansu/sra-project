private void startService() {
    if (!(serviceHelper.isServiceRunning(com.labs.dm.auto_tethering.service.TetheringService.class))) {
        com.labs.dm.auto_tethering.activity.Intent serviceIntent = new com.labs.dm.auto_tethering.activity.Intent(this, com.labs.dm.auto_tethering.service.TetheringService.class);
        serviceIntent.putExtra("runFromActivity", true);
        startService(serviceIntent);
    }
}
private void enableService(boolean enable) {
    isServiceEnabled = enable;
    setServiceEnabled(enable);
    android.content.Intent intent = new android.content.Intent(this, ph.intrepidstream.callmanager.service.CallManageService.class);
    if (enable) {
        askPermission();
        startService(intent);
    }else {
        stopService(intent);
    }
}
public void disconnectService() {
    if ((mService) != null) {
        mService.getBleManager().stopScan();
        unbindService(mConnection);
        mService = null;
    }
}
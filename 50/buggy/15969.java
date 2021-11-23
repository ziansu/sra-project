public void destroyDownloadService() {
    serviceHostContext.unbindService(serviceConnection);
    serviceHostContext.stopService(serviceIntent);
    downloadBinder.cancelDownload();
    downloadBinder = null;
    serviceConnectFlag = false;
}
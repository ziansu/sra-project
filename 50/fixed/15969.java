public void destroyDownloadService() {
    serviceHostContext.unbindService(serviceConnection);
    serviceHostContext.stopService(serviceIntent);
    downloadBinder.cancelDownload(true);
    downloadBinder = null;
    serviceConnectFlag = false;
}
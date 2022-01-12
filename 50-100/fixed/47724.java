public void onDestroy() {
    super.onDestroy();
    stopPlayback();
    if ((mExoPlayer) != null) {
        releaseExoPlayer();
    }
    if ((connectivity) != null) {
        connectivity.destroy();
        connectivity = null;
    }
    if ((notifUpdate_Receiver) != null)
        unregisterReceiver(notifUpdate_Receiver);
    
    org.oucho.radio2.net.WifiLocker.unlock();
}
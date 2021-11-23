public void release() {
    if ((blueManager) != null) {
        blueManager.close();
        blueManager = null;
    }
    if (bAdapter.isDiscovering()) {
        bAdapter.cancelDiscovery();
    }
    connectListener = null;
    scanListener = null;
    readerCallback = null;
    unregisterReceiver();
    com.inavr.bluetoothlibrary.BlueStateObserver.getInstance().destroy();
}
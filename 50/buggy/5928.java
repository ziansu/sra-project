private synchronized void connectNotInUi() {
    rtmpConnection.connect(mRtmpUrl);
    rtmpConnection.setConnectListener(listener);
}
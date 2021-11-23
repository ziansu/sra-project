@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((nbmWebRTCPeer) != null) {
        nbmWebRTCPeer.close();
    }
}
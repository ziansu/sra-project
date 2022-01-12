public void receiveFromRemote(android.view.View view) {
    if ((callState) == (fi.vtt.nubotest.PeerVideoActivity.CallState.PUBLISHED)) {
        nbmWebRTCPeer.generateOffer("remote");
        callState = fi.vtt.nubotest.PeerVideoActivity.CallState.WAITING_REMOTE_USER;
        runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                mCallStatus.setText("Waiting remote stream...");
            }
        });
    }
}
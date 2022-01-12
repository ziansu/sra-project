public void onDestroy() {
    for (fr.pchab.webrtcclient.WebRtcClient.Peer peer : peers.values()) {
        peer.pc.dispose();
    }
    if ((videoSource) != null) {
        videoSource.stop();
    }
    factory.dispose();
    client.disconnect();
    client.close();
}
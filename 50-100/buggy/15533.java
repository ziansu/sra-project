public void onDestroy() {
    for (fr.pchab.webrtcclient.WebRtcClient.Peer peer : peers.values()) {
        peer.pc.dispose();
    }
    videoSource.stop();
    factory.dispose();
    client.disconnect();
    client.close();
}
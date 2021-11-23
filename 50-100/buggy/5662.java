private PeerConnection.RTCConfiguration parseRTCConfiguration(com.facebook.react.bridge.ReadableMap map) {
    com.facebook.react.bridge.ReadableArray iceServersArray = null;
    if (map != null) {
        iceServersArray = map.getArray("iceServers");
    }
    java.util.List<com.oney.WebRTCModule.PeerConnection.IceServer> iceServers = createIceServers(iceSeversArray);
    com.oney.WebRTCModule.PeerConnection.RTCConfiguration configuration = new com.oney.WebRTCModule.PeerConnection.RTCConfiguration(iceServers);
    return configuration;
}
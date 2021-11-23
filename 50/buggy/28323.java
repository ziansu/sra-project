public boolean startRtcEventLog(int file_descriptor, long max_size_bytes) {
    return org.webrtc.PeerConnection.nativeStartRtcEventLog(nativePeerConnection, file_descriptor, max_size_bytes);
}
@java.lang.Override
public void run() {
    if (((peerConnection) == null) || (isError)) {
        return ;
    }
    remoteVideoTrack = null;
    stream.videoTracks.get(0).dispose();
}
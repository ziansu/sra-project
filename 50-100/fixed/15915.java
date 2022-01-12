public synchronized boolean selectAudioTrack(int pid) {
    if ((mPids[org.xvdr.extractor.LiveTvSource.TRACK_AUDIO]) == pid) {
        return true;
    }
    org.xvdr.robotv.tv.StreamBundle.Stream stream = mBundle.getStreamOfPid(pid);
    if (stream == null) {
        return false;
    }
    mPids[org.xvdr.extractor.LiveTvSource.TRACK_AUDIO] = stream.physicalId;
    addReader(org.xvdr.extractor.LiveTvSource.TRACK_AUDIO, stream);
    mFormatSent.put(org.xvdr.extractor.LiveTvSource.TRACK_AUDIO, false);
    postAudioTrackChanged(stream);
    return true;
}
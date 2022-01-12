private void closeIdleStreams(int newMaxActiveRemoteStreamId) throws org.apache.coyote.http2.Http2Exception {
    for (int i = (maxActiveRemoteStreamId) + 2; i < newMaxActiveRemoteStreamId; i += 2) {
        org.apache.coyote.http2.Stream stream = getStream(i, false);
        if (stream != null) {
            stream.closeIfIdle();
        }
    }
    maxActiveRemoteStreamId = newMaxActiveRemoteStreamId;
}
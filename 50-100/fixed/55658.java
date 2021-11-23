public void setMaxFrameSize(long maxFrameSize) throws java.io.IOException {
    if ((maxFrameSize < (org.apache.coyote.http2.ConnectionSettings.MIN_MAX_FRAME_SIZE)) || (maxFrameSize > (org.apache.coyote.http2.ConnectionSettings.MAX_MAX_FRAME_SIZE))) {
        throw new org.apache.coyote.http2.Http2Exception(sm.getString("connectionSettings.maxFrameSizeInvalid", java.lang.Long.toString(maxFrameSize), java.lang.Integer.toString(org.apache.coyote.http2.ConnectionSettings.MIN_MAX_FRAME_SIZE), java.lang.Integer.toString(org.apache.coyote.http2.ConnectionSettings.MAX_MAX_FRAME_SIZE)), 0, Http2Exception.PROTOCOL_ERROR);
    }
    this.maxFrameSize = ((int) (maxFrameSize));
}
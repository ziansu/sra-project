private void startResponseRendering(int code, org.rapidoid.commons.MediaType contentType) {
    http.startResponse(channel, code, isKeepAlive, contentType);
    renderCustomHeaders();
    org.rapidoid.buffer.Buf out = channel.output();
    channel.write(FastHttp.CONTENT_LENGTH_UNKNOWN);
    posConLen = out.size();
    channel.write(org.rapidoid.http.fast.CR_LF);
    channel.write(org.rapidoid.http.fast.CR_LF);
    posBefore = out.size();
}
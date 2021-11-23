private void write(su.litvak.chromecast.api.v2.CastChannel.CastMessage message) throws java.io.IOException {
    socket.getOutputStream().write(su.litvak.chromecast.api.v2.Util.toArray(message.getSerializedSize()));
    message.writeTo(socket.getOutputStream());
}
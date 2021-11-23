public void onMuxData(int channelId, byte[] data, int offset, int length) {
    if ((_onBinaryMessage) != null) {
        _onBinaryMessage.onMessage(data, offset, length);
    }
}
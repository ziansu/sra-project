public byte[] readPacket() {
    byte[] buffer = this.socket.readPacket();
    byte buff = buffer[((buffer.length) - 1)];
    byte[] bytes = new byte[]{ ((byte) (buff)) };
    if (bytes == (org.itxtech.synapseapi.network.synlib.ServerConnection.MAGIC_BYTES)) {
        if ((buffer.length) > 4) {
        }
    }
    return buffer;
}
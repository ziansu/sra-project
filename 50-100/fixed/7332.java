public byte[] readPacket() {
    byte[] buff = new byte[]{  };
    byte[] buffer = this.socket.readPacket();
    byte[] bytes = new byte[]{ ((byte) (buffer[((buffer.length) - 1)])) };
    if (bytes == (org.itxtech.synapseapi.network.synlib.ServerConnection.MAGIC_BYTES)) {
        if ((buffer.length) > 4) {
        }
    }
    return buff;
}
public byte[] sendPacket(chatprogramm.cll.client.format.Packet toSend) throws java.io.IOException {
    byte[] payload = toSend.getPacket(this.chipher);
    this.writes(payload);
    if ((toSend.getCommand()) < 3) {
        payload = this.reads();
        payload = this.chipher.decrypt(payload);
    }else {
        payload = new byte[1];
        payload[0] = 1;
    }
    return payload;
}
public static packet createPacket(int SeqNum, java.lang.String data) throws java.lang.Exception {
    return new packet(1, SeqNum, data);
}
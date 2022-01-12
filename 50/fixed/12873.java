private int getSentSeqNr(byte[] data) {
    byte[] seqNmbInBytes = new byte[4];
    java.lang.System.arraycopy(data, 0, seqNmbInBytes, 0, 4);
    return Packet.toInt(seqNmbInBytes);
}
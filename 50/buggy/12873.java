private int getSentSeqNr(byte[] data2) {
    byte[] seqNmbInBytes = new byte[4];
    java.lang.System.arraycopy(data2, 0, seqNmbInBytes, 0, 4);
    return Packet.toInt(seqNmbInBytes);
}
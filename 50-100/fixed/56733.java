public static communication.pdu.NetworkPDU createNetworkPDU(byte[] data) {
    if ((data == null) || ((data.length) < 1)) {
        return null;
    }
    int length = communication.utils.NumberParser.byteToUnsignedInt(data[0]);
    byte[] newData = java.util.Arrays.copyOfRange(data, 1, (1 + length));
    return new communication.pdu.NetworkPDU(new communication.pdu.PDU(newData));
}
public static communication.pdu.PresentationPDU createPresentationPDU(byte[] data) {
    if ((data == null) || ((data.length) < 1)) {
        return null;
    }
    int flags = communication.utils.NumberParser.intToByte(data[0]);
    byte[] newData = java.util.Arrays.copyOfRange(data, 1, data.length);
    return new communication.pdu.PresentationPDU(flags, new communication.pdu.PDU(newData));
}
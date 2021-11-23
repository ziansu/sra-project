public static communication.pdu.SessionPDU createSessionPDU(byte[] data) {
    if ((data == null) || ((data.length) < 2)) {
        return null;
    }
    int flags = communication.utils.NumberParser.intToByte(data[0]);
    int sessionId = communication.utils.NumberParser.intToByte(data[1]);
    byte[] newData = java.util.Arrays.copyOfRange(data, 2, data.length);
    return new communication.pdu.SessionPDU(flags, sessionId, new communication.pdu.PDU(newData));
}
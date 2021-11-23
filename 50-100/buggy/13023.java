public static communication.pdu.SessionPDU createSessionPDU(byte[] data) {
    int flags = communication.utils.NumberParser.intToByte(data[0]);
    int sessionId = communication.utils.NumberParser.intToByte(data[1]);
    byte[] newData = java.util.Arrays.copyOfRange(data, 2, data.length);
    return new communication.pdu.SessionPDU(flags, sessionId, new communication.pdu.PDU(newData));
}
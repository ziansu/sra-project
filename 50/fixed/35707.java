public static communication.pdu.TransportPDU createTransportPDU(byte[] data) {
    if (data == null) {
        return null;
    }
    return new communication.pdu.TransportPDU(new communication.pdu.PDU(data));
}
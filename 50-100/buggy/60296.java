public static boolean hasStatus(byte[] receivedApdu, byte[] statusCode) throws java.io.IOException {
    byte[] receivedStatus = nordpol.Apdu.statusBytes(receivedApdu);
    return ((receivedStatus[0]) == (statusCode[0])) && ((receivedStatus[0]) == (statusCode[0]));
}
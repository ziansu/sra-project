private static byte[] getReceiverId(byte[] receiverSecret) {
    return java.util.Arrays.copyOf(org.interledger.psk.io.PskUtils.hmac(receiverSecret, org.interledger.psk.io.PskUtils.IPR_RECEIVER_ID_STRING), org.interledger.psk.io.PskUtils.RECEIVER_ID_LENGTH);
}
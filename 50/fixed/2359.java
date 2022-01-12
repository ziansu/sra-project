public byte[] getPayloadData() {
    return java.util.Arrays.copyOfRange(payloadData, payloadOffset, ((payloadData.length) - (crcEnabled ? 4 : 0)));
}
public byte[] getPayloadData() {
    java.lang.System.out.println(("Get payload: offset:" + (payloadOffset)));
    return java.util.Arrays.copyOfRange(payloadData, payloadOffset, ((payloadData.length) - (crcEnabled ? 4 : 0)));
}
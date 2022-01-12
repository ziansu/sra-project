public static java.lang.String getOrderedHash(long guidNum) {
    java.nio.ByteBuffer buffer = java.nio.ByteBuffer.allocate(java.lang.Long.BYTES);
    buffer.putLong(guidNum);
    java.lang.String hexArray = edu.umass.cs.contextservice.utils.Utils.byteArrayToHex(buffer.array());
    for (int i = 0; i < (40 - (hexArray.length())); i++) {
        hexArray = "0" + hexArray;
    }
    return hexArray;
}
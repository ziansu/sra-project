public static java.lang.String getOrderedHash(long guidNum) {
    java.nio.ByteBuffer buffer = java.nio.ByteBuffer.allocate(java.lang.Long.BYTES);
    buffer.putLong(guidNum);
    java.lang.String hexArray = edu.umass.cs.contextservice.utils.Utils.byteArrayToHex(buffer.array());
    while ((hexArray.length()) < 40) {
        hexArray = "0" + hexArray;
    } 
    return hexArray;
}
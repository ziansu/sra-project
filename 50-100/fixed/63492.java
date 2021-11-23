public static java.lang.String readNulTerminatedStr(byte[] data) {
    int len = 0;
    while ((len < (data.length)) && ((data[len]) != 0)) {
        ++len;
    } 
    byte[] subarray = new byte[len];
    java.lang.System.arraycopy(data, 0, subarray, 0, len);
    return new java.lang.String(subarray, java.nio.charset.StandardCharsets.UTF_8);
}
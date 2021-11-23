public static byte[] StringHexToByteArray(java.lang.String x) throws java.lang.Exception {
    if (x.startsWith("0x")) {
        x = x.substring(2);
    }
    if (((x.length()) % 2) != 0)
        x = "0" + x;
    
    return org.spongycastle.util.encoders.Hex.decode(x);
}
public static byte[] StringHexToByteArray(java.lang.String x) throws java.lang.Exception {
    if (!(x.startsWith("0x")))
        throw new java.lang.Exception("Incorrect hex syntax");
    
    x = x.substring(2);
    return org.spongycastle.util.encoders.Hex.decode(x);
}
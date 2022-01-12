public static java.lang.String decode(java.lang.String s) {
    if (((s.length()) == 0) || (((s.indexOf('%')) < 0) && ((s.indexOf('+')) < 0))) {
        return s;
    }
    boolean ascii = org.mule.module.apikit.uri.URICoder.isEncodedASCII(s);
    return ascii ? org.mule.module.apikit.uri.URICoder.decode_ASCII(s) : org.mule.module.apikit.uri.URICoder.decode_UTF8(s);
}
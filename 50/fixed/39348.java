@java.lang.Override
public final java.lang.String encodeToBase64() {
    java.lang.String base64Codes = new sun.misc.BASE64Encoder().encode(encode());
    return base64Codes;
}
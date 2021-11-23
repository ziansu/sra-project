@java.lang.Override
public void encodePrintableString(final java.lang.String str) {
    int c;
    int i = 0;
    for (c = str.codePointAt(i); i < (str.length()); i = str.offsetByCodePoints(i, 1)) {
        validatePrintableByte(c);
    }
    writeElement(org.wildfly.security.asn1.PRINTABLE_STRING_TYPE, str.getBytes(java.nio.charset.StandardCharsets.US_ASCII));
}
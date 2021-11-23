@java.lang.Override
public void encodePrintableString(final java.lang.String str) {
    for (int i = 0; i < (str.length()); i = str.offsetByCodePoints(i, 1)) {
        validatePrintableByte(str.codePointAt(i));
    }
    writeElement(org.wildfly.security.asn1.PRINTABLE_STRING_TYPE, str.getBytes(java.nio.charset.StandardCharsets.US_ASCII));
}
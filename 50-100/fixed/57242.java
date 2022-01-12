private static java.lang.String matchSingleVCardPrefixedField(java.lang.CharSequence prefix, java.lang.String rawText, boolean trim) {
    java.util.List<java.lang.String> values = com.google.zxing.client.result.VCardResultParser.matchSingleVCardPrefixedField(prefix, rawText, trim, false);
    return (values == null) || (values.isEmpty()) ? null : values.get(0);
}
public static final java.lang.String prettyFormatXml(java.lang.String input) {
    if (input == null) {
        return null;
    }
    return com.tomecode.oracle.osb12c.Utils.formatXml(new javax.xml.transform.stream.StreamSource(new java.io.StringReader(input)));
}
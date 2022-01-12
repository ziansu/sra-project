public static final java.lang.String prettyFormatXml(org.w3c.dom.Node input) {
    if (input == null) {
        return null;
    }
    return com.tomecode.oracle.osb12c.Utils.formatXml(new javax.xml.transform.dom.DOMSource(input));
}
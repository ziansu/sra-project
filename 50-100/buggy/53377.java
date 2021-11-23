public java.lang.String asXml() {
    if (((name) != null) & ((value) != null)) {
        return ((("          <Annotation name=\"" + (name)) + "\">") + (org.owasp.esapi.ESAPI.encoder().encodeForXML(value))) + "</Annotation>";
    }
    return "";
}
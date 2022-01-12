@edu.umd.cs.findbugs.annotations.SuppressFBWarnings(value = "DM_DEFAULT_ENCODING")
public java.lang.String getContent() throws java.io.IOException {
    return new java.lang.String(javax.xml.bind.DatatypeConverter.parseBase64Binary(getEncodedContent()));
}
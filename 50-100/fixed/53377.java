public java.lang.String asXml() {
    if (((name) != null) & ((value) != null)) {
        return ((("          <Annotation name=\"" + (name)) + "\">") + (value)) + "</Annotation>";
    }
    return "";
}
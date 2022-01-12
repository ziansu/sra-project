private java.lang.String getValue(final jd.parser.html.InputField inputField) {
    if (inputField != null) {
        return jd.nutils.encoding.Encoding.urlDecode(inputField.getValue(), false);
    }
    return null;
}
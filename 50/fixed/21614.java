private java.lang.String wrapWithDoubleQuotationIfStringContainsSpace(java.lang.String value) {
    if ((value == null) || (!(value.contains(" ")))) {
        return value;
    }
    return ("\"" + value) + "\"";
}
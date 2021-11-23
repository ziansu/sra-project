private java.lang.String wrapWithDoubleQuotationIfStringContainsSpace(java.lang.String value) {
    if (value.contains(" ")) {
        return ("\"" + value) + "\"";
    }else {
        return value;
    }
}
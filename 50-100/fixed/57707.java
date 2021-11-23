private static com.health.ValueType getColumnType(final org.w3c.dom.Element column) throws com.health.input.InputException {
    assert column != null;
    if (!(column.hasAttribute("type"))) {
        return com.health.ValueType.String;
    }
    try {
        return com.health.ValueType.valueOf(column.getAttribute("type"));
    } catch (java.lang.IllegalArgumentException ex) {
        throw new com.health.input.InputException(java.lang.String.format("Column '%s' has an invalid type: '%s'.", column.getTextContent(), column.getAttribute("type")), ex);
    }
}
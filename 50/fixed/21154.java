public cz.lidinsky.tools.ToStringBuilder append(java.lang.String fieldName, java.lang.Object[] value) {
    if (fieldName != null) {
        appendFieldName(fieldName);
        appendValue(value);
    }
    return this;
}
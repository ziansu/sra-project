public cz.lidinsky.tools.ToStringBuilder append(java.lang.String fieldName, java.lang.Object object) {
    if (fieldName != null) {
        appendFieldName(fieldName);
        appendValue(object);
        style.appendFieldDelimiter(sb);
    }
    return this;
}
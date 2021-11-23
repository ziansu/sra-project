public cz.lidinsky.tools.ToStringBuilder append(java.lang.String fieldName, java.lang.Object object) {
    if (fieldName != null) {
        style.appendFieldName(sb, fieldName);
        appendValue(object);
        style.appendFieldDelimiter(sb);
    }
    return this;
}
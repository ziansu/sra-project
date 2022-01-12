public cz.lidinsky.tools.ToStringBuilder append(java.lang.String fieldName, float value) {
    if (fieldName != null) {
        appendFieldName(fieldName);
        style.appendValue(sb, value);
        style.appendFieldDelimiter(sb);
    }
    return this;
}
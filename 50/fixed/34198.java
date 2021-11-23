public cz.lidinsky.tools.ToStringBuilder append(java.lang.String fieldName, cz.lidinsky.tools.IToStringBuildable[] value) {
    if (fieldName != null) {
        appendFieldName(fieldName);
        appendValue(value);
    }
    return this;
}
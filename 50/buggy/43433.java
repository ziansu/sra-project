public java.lang.String getFieldNameForOrderBy() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(name);
    addTextFieldNameSuffix(sb, this::appendKey, this::appendValue, this::appendWords);
    return sb.toString();
}
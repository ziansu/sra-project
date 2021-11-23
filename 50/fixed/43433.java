public java.lang.String getFieldNameForOrderBy() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(name);
    addTextFieldNameSuffix(sb, this::appendValue, this::appendKey, this::appendWords);
    return sb.toString();
}
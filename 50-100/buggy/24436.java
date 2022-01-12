protected java.lang.String build() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(name);
    sb.append(" ");
    sb.append(type.toString());
    createColumnParams(sb);
    sb.append(")");
    return sb.toString();
}
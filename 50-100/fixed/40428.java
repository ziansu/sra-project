@java.lang.Override
public java.lang.String toSQLString(boolean withAlias) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder(name.toSQLString());
    if (withAlias && ((this.alias) != null)) {
        sb.append(" AS ").append(alias);
    }
    return sb.toString();
}
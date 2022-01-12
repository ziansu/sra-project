@java.lang.Override
public java.lang.String getMessage() {
    java.lang.StringBuilder buf = new java.lang.StringBuilder();
    buf.append(super.getMessage());
    if ((statement) != null) {
        buf.append(", query was: ");
        buf.append(statement.toString());
    }
    return buf.toString();
}
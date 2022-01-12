@java.lang.Override
public java.lang.String getMessage() {
    java.lang.StringBuffer sb = new java.lang.StringBuffer("Undefined variables in instance: ");
    boolean first = true;
    for (java.lang.String var : undefined) {
        if (!first)
            sb.append(", ");
        
        sb.append(var.toString());
        first = false;
    }
    return sb.toString();
}
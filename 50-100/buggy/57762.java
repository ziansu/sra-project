private java.lang.String toString(org.aludratest.eclipse.vde.model.IStringValue[] values) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[");
    for (org.aludratest.eclipse.vde.model.IStringValue sv : values) {
        if ((sb.length()) > 1) {
            sb.append(", ");
            sb.append(sv.getValue());
        }
    }
    sb.append("]");
    return sb.toString();
}
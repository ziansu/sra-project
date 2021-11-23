private java.lang.String createSignalsOnly() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("signals_only ");
    for (java.lang.String s : exceptions) {
        sb.append(s);
        if (exceptions.getLast().equals(s)) {
            sb.append(";\n");
        }else {
            sb.append(", ");
        }
    }
    return sb.toString();
}
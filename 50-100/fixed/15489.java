private java.lang.String join(java.lang.Iterable<java.lang.String> items) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    boolean first = true;
    for (java.lang.String item : items) {
        if (!first) {
            sb.append(",");
        }
        sb.append(item);
        first = false;
    }
    return sb.toString();
}
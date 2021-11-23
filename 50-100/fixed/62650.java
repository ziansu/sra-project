public static final java.lang.String join(java.util.Collection<?> list, java.lang.String separator) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder(1024);
    boolean first = true;
    for (java.lang.Object item : list) {
        if (first) {
            first = false;
        }else {
            sb.append(separator);
        }
        sb.append(item);
    }
    return sb.toString();
}
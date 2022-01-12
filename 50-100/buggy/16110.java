public static final java.lang.String padRightEvenly(final java.lang.String s, final char c) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    if (s != null) {
        if (s.isEmpty()) {
            sb.append(c);
            sb.append(c);
        }else {
            if (api.util.Mathematics.isOdd(s.length())) {
                sb.append(s);
                sb.append(c);
            }
        }
    }
    return sb.toString();
}
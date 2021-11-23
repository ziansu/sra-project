public static final java.lang.String padLeftEvenly(final java.lang.String s, final char c) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    if (s != null) {
        if (s.isEmpty()) {
            sb.append(c);
            sb.append(c);
        }else {
            if (api.util.Mathematics.isOdd(s.length())) {
                sb.append(c);
                sb.append(s);
            }
        }
    }
    return sb.toString();
}
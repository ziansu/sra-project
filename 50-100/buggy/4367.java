public static final java.lang.String padLeftEvenly(final java.lang.String s, final char c) {
    java.lang.String result = s;
    if ((result != null) && (api.util.Mathematics.isOdd(result.length()))) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(c);
        sb.append(result);
        result = sb.toString();
    }
    return result;
}
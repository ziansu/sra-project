public static final java.lang.String padRightEvenly(final java.lang.String s, final char c) {
    java.lang.String result = s;
    if ((result != null) && (api.util.Mathematics.isOdd(result.length()))) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(result);
        sb.append(c);
        result = sb.toString();
    }
    return result;
}
private static java.lang.String filterChars(java.lang.String s) {
    if (s == null) {
        return null;
    }
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (char c : s.toCharArray()) {
        if (("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c)) >= 0) {
            sb.append(c);
        }
    }
    return sb.toString();
}
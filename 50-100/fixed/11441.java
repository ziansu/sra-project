public static java.lang.CharSequence _text(java.lang.CharSequence icon, java.lang.CharSequence text) {
    final java.lang.StringBuilder s = new java.lang.StringBuilder();
    if ((icon != null) && ((icon.length()) > 0)) {
        s.append(icon).append("  ");
    }
    return s.append(text);
}
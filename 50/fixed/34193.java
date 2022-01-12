public static java.lang.String triml(java.lang.String s, java.lang.String prefix) {
    return s.startsWith(prefix) ? s.substring(prefix.length()) : s;
}
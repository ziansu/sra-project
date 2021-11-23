public static boolean find(java.lang.String s, java.util.regex.Pattern pattern) {
    if ((s == null) || ((s.length()) == 0)) {
        return false;
    }
    return pattern.matcher(s).find();
}
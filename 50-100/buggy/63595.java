public static boolean semicolon(java.lang.String line) {
    boolean okay = false;
    java.util.regex.Matcher match = java.util.regex.Pattern.compile(((".*" + (java.util.regex.Pattern.quote(";"))) + "$")).matcher(line);
    if (match.matches()) {
        okay = true;
    }else {
        okay = linter1.bracket(line);
    }
    return okay;
}
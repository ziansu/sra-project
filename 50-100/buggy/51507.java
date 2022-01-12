private static boolean globMatches(java.lang.String pattern, java.lang.CharSequence input) {
    java.util.regex.Pattern p = java.util.regex.Pattern.compile(("\\Q" + (pattern.replaceAll("\\\\n", "").replace("*", "\\E.*\\Q").replace("?", "\\E.\\Q"))), java.util.regex.Pattern.DOTALL);
    java.util.regex.Matcher m = p.matcher(input.toString().replaceAll("\n", ""));
    return m.matches();
}
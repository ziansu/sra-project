public boolean isBlock(java.lang.String s) {
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("127\\.0\\.0\\.1\\s+w.+\\s#\\d+");
    java.util.regex.Matcher matcher = pattern.matcher(s);
    if (matcher.matches()) {
        return true;
    }
    return false;
}
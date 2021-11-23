private boolean match(java.lang.String value, java.lang.String strPattern) {
    if ((value != null) && ((value.length()) > 0)) {
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(strPattern);
        java.util.regex.Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }else {
        return true;
    }
}
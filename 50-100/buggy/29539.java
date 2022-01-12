public static boolean isDigitOrString(java.lang.String string) {
    java.lang.String pattern1 = "\\d+";
    java.lang.String pattern2 = "^\"\\w*\"$";
    java.lang.String pattern3 = "\\w*";
    if (((java.util.regex.Pattern.matches(pattern1, string)) || (java.util.regex.Pattern.matches(pattern2, string))) || (java.util.regex.Pattern.matches(pattern3, string))) {
        if ((java.util.regex.Pattern.matches(pattern1, string)) || (java.util.regex.Pattern.matches(pattern2, string))) {
            return true;
        }
        return false;
    }
}
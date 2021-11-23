public static boolean controllaCF(java.lang.String cf) {
    java.util.regex.Pattern cfRegExp = java.util.regex.Pattern.compile("[A-Za-z]{6}[0-9]{2}[A-Za-z]{1}[0-9]{2}[A-Za-z0-9]{4}[A-Za-z]{1}");
    java.util.regex.Matcher match = cfRegExp.matcher(cf);
    if (match.matches())
        return true;
    else
        return false;
    
}
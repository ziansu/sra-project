public static boolean isInteger(java.lang.String str) {
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("^[-\\+]?[\\d]*$");
    if ((str != null) && ((pattern.matcher(str)) != null))
        return pattern.matcher(str).matches();
    else
        return false;
    
}
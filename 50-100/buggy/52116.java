public static boolean substTest(java.lang.String result, java.lang.String match, java.lang.String subst, java.util.Hashtable<java.lang.String, java.lang.String> hash) {
    java.util.regex.Pattern p = java.util.regex.Pattern.compile(match);
    java.util.regex.Matcher m = p.matcher(result);
    if (m.find()) {
        result = m.replaceFirst(subst);
        if (hash.containsKey(result)) {
            return true;
        }
        return false;
    }else
        return false;
    
}
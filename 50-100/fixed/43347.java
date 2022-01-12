public static java.util.ArrayList<java.lang.String> findTSQLParameters(java.lang.String content) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("(\\$[^\",;:=\\) ]*)", java.util.regex.Pattern.CASE_INSENSITIVE);
    java.util.regex.Matcher matcher = pattern.matcher(content);
    java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<>();
    while (matcher.find()) {
        java.lang.String param = matcher.group();
        list.add(param.substring(1).trim());
    } 
    return list;
}
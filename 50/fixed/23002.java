private static boolean checkParam(java.lang.String param) {
    java.util.regex.Pattern p = java.util.regex.Pattern.compile("^[a-zA-Z0-9]+$");
    java.util.regex.Matcher m = p.matcher(param);
    return m.matches();
}
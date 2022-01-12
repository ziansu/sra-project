public static boolean validate(java.lang.String service) {
    java.lang.String pattern = "([A-J][0-9]{2}|[0-9]{3})[CNEV]?";
    service = service.toUpperCase().replace(" ", "");
    java.util.regex.Pattern p = java.util.regex.Pattern.compile(pattern);
    java.util.regex.Matcher m = p.matcher(service);
    return m.matches();
}
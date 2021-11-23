private static boolean matches(java.lang.String text, java.lang.String pattern) {
    boolean searchmatch = false;
    java.lang.String[] searchparams = pattern.split(";");
    for (java.lang.String param : searchparams) {
        param = param.trim();
        searchmatch = searchmatch || (text.matches(("(?i)" + (param.replace("?", ".?").replace("*", ".*?")))));
    }
    return searchmatch;
}
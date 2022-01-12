public java.util.List<java.lang.String> getTokens(java.lang.String input) {
    java.util.regex.Matcher matcher = compile.matcher(input.toLowerCase());
    java.util.List<java.lang.String> res = new java.util.ArrayList();
    while (matcher.find()) {
        res.add(matcher.group());
    } 
    return res;
}
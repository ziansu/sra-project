private void parseRequest(java.lang.String input) {
    if ((input == null) || (input.isEmpty()))
        return ;
    
    java.lang.String[] terms = input.split(" ");
    request.put("Type", terms[0].toUpperCase());
    if (terms[1].endsWith("/"))
        terms[1] += Configuration.DEFAULT_FILE;
    
    request.put("UrlPath", terms[1]);
    parseURL(terms[1]);
}
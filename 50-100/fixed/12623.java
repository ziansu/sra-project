public java.util.List<java.lang.String> getCookies() {
    java.lang.String cookies = headers.get("Cookie: ");
    java.lang.System.err.println(cookies);
    java.util.List<java.lang.String> cookiesList = new java.util.LinkedList<java.lang.String>();
    if (cookies != null) {
        java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(cookies, "; ");
        while (tokenizer.hasMoreTokens()) {
            java.lang.String cookie = tokenizer.nextToken();
            cookiesList.add(cookie);
        } 
    }
    return cookiesList;
}
public java.lang.String get(java.lang.String key) {
    javax.servlet.http.Cookie[] cookies = this.request.getCookies();
    if (cookies == null)
        return null;
    
    for (int i = 0; i < (cookies.length); i++) {
        if (cookies[i].getName().equals(key))
            return cookies[i].getValue();
        
    }
    return null;
}
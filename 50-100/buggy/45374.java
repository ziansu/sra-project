public java.lang.String get(java.lang.String key) {
    javax.servlet.http.Cookie[] cookies = this.request.getCookies();
    for (int i = 0; i < (cookies.length); i++) {
        if (cookies[i].getName().equals(key))
            return cookies[i].getValue();
        
    }
    return null;
}
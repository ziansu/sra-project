private static org.restlet.data.Form extractCookieValueAsForm(org.restlet.data.Cookie cookie) {
    java.lang.String value = cookie.getValue();
    return new org.restlet.data.Form((value != null ? value : ""));
}
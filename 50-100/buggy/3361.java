private java.util.Locale findSupportedLocale(javax.servlet.http.HttpServletRequest request, java.util.Locale fallback) {
    java.util.Enumeration<java.util.Locale> requestLocales = request.getLocales();
    while (requestLocales.hasMoreElements()) {
        java.util.Locale locale = requestLocales.nextElement();
        if (getSupportedLocales().contains(locale)) {
            return locale;
        }
    } 
    return fallback;
}
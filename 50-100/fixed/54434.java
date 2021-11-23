public static java.util.Locale ensureLocale(java.lang.Object localeObject) {
    if (localeObject instanceof java.lang.String) {
        return org.ofbiz.base.util.UtilMisc.parseLocale(((java.lang.String) (localeObject)));
    }else
        if (localeObject instanceof java.util.Locale) {
            return ((java.util.Locale) (localeObject));
        }
    
    return java.util.Locale.getDefault();
}
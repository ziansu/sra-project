public static java.util.Locale ensureLocale(java.lang.Object localeObject) {
    if ((localeObject != null) && (localeObject instanceof java.lang.String)) {
        localeObject = org.ofbiz.base.util.UtilMisc.parseLocale(((java.lang.String) (localeObject)));
    }
    if ((localeObject != null) && (localeObject instanceof java.util.Locale)) {
        return ((java.util.Locale) (localeObject));
    }
    return java.util.Locale.getDefault();
}
@java.lang.Override
protected java.util.Locale determineDefaultLocale(final javax.servlet.http.HttpServletRequest request) {
    final java.util.Locale locale = request.getLocale();
    if ((org.apache.commons.lang3.StringUtils.isBlank(casProperties.getLocale().getDefaultValue())) || (locale.getLanguage().equals(casProperties.getLocale().getDefaultValue()))) {
        return locale;
    }
    return new java.util.Locale(casProperties.getLocale().getDefaultValue());
}
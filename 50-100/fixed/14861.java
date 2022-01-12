private java.lang.Long getLanguageId(final java.lang.String userLocaleString) {
    java.lang.Long languageId = null;
    final java.util.Locale locale = com.liferay.util.LocaleUtil.fromLanguageId(userLocaleString);
    if (null != locale) {
        try {
            languageId = this.languageAPI.getLanguage(locale.getLanguage(), locale.getCountry()).getId();
        } catch (java.lang.Exception e) {
            languageId = null;
        }
    }
    if (null == languageId) {
        languageId = this.languageAPI.getDefaultLanguage().getId();
    }
    return languageId;
}
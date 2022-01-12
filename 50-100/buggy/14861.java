private java.lang.Long getLanguageId(final java.lang.String userLocaleString, final com.dotmarketing.portlets.languagesmanager.business.LanguageAPI languageAPI) {
    java.lang.Long languageId = null;
    final java.util.Locale locale = com.liferay.util.LocaleUtil.fromLanguageId(userLocaleString);
    if (null != locale) {
        try {
            languageId = languageAPI.getLanguage(locale.getLanguage(), locale.getCountry()).getId();
        } catch (java.lang.Exception e) {
            languageId = null;
        }
    }
    if (null == languageId) {
        languageId = languageAPI.getDefaultLanguage().getId();
    }
    return languageId;
}
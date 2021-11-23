@java.lang.Override
public java.lang.String getLabel(java.util.Locale locale) {
    java.util.ResourceBundle resourceBundle = com.liferay.portal.kernel.util.ResourceBundleUtil.getBundle("content.Language", locale, getClass());
    return com.liferay.portal.kernel.language.LanguageUtil.get(locale, getKey());
}
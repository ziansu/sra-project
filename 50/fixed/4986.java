public static java.lang.String getText(java.util.Locale locale, java.lang.String key, java.lang.Object... params) {
    return new java.text.MessageFormat(fi.foyt.fni.i18n.ExternalLocales.getText(locale, key), locale).format(params);
}
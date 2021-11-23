public void setLocale(final java.util.Locale locale) {
    if (locale == null) {
        preferences.setLocaleLanguage(StringHelper.EMPTY);
    }else {
        preferences.setLocaleLanguage(locale.getLanguage());
    }
}
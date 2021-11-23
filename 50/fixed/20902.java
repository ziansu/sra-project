public java.lang.String getLocale() {
    return getString(R.string.pref_locale, java.util.Locale.getDefault().getLanguage());
}
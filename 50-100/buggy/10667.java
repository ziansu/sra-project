private void setLanguage(java.lang.String lang) {
    java.util.Locale locale = null;
    if (lang == null) {
        locale = java.util.Locale.getDefault();
    }else {
        locale = java.util.Locale.forLanguageTag(lang);
    }
    map = be.nikiroo.jvcard.resources.Bundles.getBundle("resources", locale);
}
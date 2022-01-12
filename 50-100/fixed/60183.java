public static java.lang.String getMsg(java.lang.String key) {
    if (!(i18n.I18n.bundle.containsKey(key))) {
        i18n.I18n.logger.warning(((("I18N missing: " + key) + " for ") + (java.util.Locale.getDefault())));
        return key;
    }
    return i18n.I18n.bundle.getString(key);
}
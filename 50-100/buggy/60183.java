public static java.lang.String getMsg(java.lang.String key) {
    if (!(key.startsWith("%"))) {
        return key;
    }
    if (!(i18n.I18n.bundle.containsKey(key))) {
        i18n.I18n.logger.warning(((("I18N missing: " + key) + " for ") + (java.util.Locale.getDefault())));
    }
    return i18n.I18n.bundle.getString(key);
}
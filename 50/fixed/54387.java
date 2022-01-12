public java.lang.String i18n(boolean ignoreError, java.lang.String msgId, java.lang.Object... args) {
    return act.i18n.I18n.i18n(ignoreError, locale(true), I18n.DEF_RESOURCE_BUNDLE_NAME, msgId, args);
}
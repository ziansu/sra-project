@java.lang.Override
public java.lang.String getWithDefault(java.lang.String key, java.lang.String defaultMessage, com.google.common.base.Optional<java.lang.String> language, java.lang.Object... params) {
    com.google.common.base.Optional<java.lang.String> value = get(key, language, params);
    if (value.isPresent()) {
        java.text.MessageFormat messageFormat = getMessageFormatForLocale(value.get(), language);
        return messageFormat.format(params);
    }else {
        java.text.MessageFormat messageFormat = getMessageFormatForLocale(defaultMessage, language);
        return messageFormat.format(params);
    }
}
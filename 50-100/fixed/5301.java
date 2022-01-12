@java.lang.Override
public java.lang.String getLocalizedMessage() {
    java.lang.String messageKey = getLocalizedMessageKey();
    if ((messageKey == null) || (messageKey.isEmpty())) {
        return "";
    }
    org.springframework.context.MessageSource messageSource = org.registrator.community.components.SpringApplicationContext.getMessageSource();
    java.util.Locale locale = org.springframework.context.i18n.LocaleContextHolder.getLocale();
    if (messageSource != null) {
        return messageSource.getMessage(messageKey, getMessageParameters(), locale);
    }else {
        return super.getLocalizedMessage();
    }
}
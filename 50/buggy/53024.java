protected java.util.Locale getRequestLocale() {
    return java.util.Optional.ofNullable(org.springframework.context.i18n.LocaleContextHolder.getLocale()).orElse(ua.kpi.mobiledev.web.exceptionHandling.ExceptionHandlingAdvice.DEFAULT_LOCALE);
}
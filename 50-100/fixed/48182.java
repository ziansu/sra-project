@java.lang.Override
public java.lang.String translate(final org.jasig.cas.authentication.principal.WebApplicationService targetService, final java.lang.String triggerValue) {
    for (final java.util.regex.Pattern pattern : translationMap.keySet()) {
        if (pattern.matcher(triggerValue).matches()) {
            return this.translationMap.get(pattern);
        }
    }
    if ((this.defaultMfaMethod) != null) {
        return defaultMfaMethod;
    }
    throw new net.unicon.cas.mfa.web.support.UnrecognizedAuthenticationMethodException(triggerValue, targetService.getId());
}
@java.lang.Override
public void configureDependencyInjection(com.opsbears.webcomponents.dic.InjectionConfiguration configuration) {
    configuration.alias(com.opsbears.webcomponents.form.CSRFTokenProviderFactory.class, com.opsbears.webcomponents.application.form.HTTPCookieCSRFTokenProviderFactory.class);
    configuration.share(getFactory());
}
@org.junit.Test(expected = java.io.IOException.class)
public void failMissingTemplate() throws java.lang.Exception {
    org.springframework.context.i18n.LocaleContextHolder.setLocale(java.util.Locale.US);
    this.configurer.resolveTemplate(getClass().getClassLoader(), ((org.springframework.web.reactive.result.view.groovy.GroovyMarkupConfigurerTests.TEMPLATE_PREFIX) + "missing.tpl"));
    fail();
}
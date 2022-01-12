@org.junit.Test
public void resolveI18nDefaultLocale() throws java.lang.Exception {
    org.springframework.context.i18n.LocaleContextHolder.setLocale(java.util.Locale.US);
    java.net.URL url = this.configurer.resolveTemplate(getClass().getClassLoader(), ((org.springframework.web.reactive.result.view.groovy.GroovyMarkupConfigurerTests.TEMPLATE_PREFIX) + "i18n.tpl"));
    org.junit.Assert.assertNotNull(url);
    org.junit.Assert.assertThat(url.getPath(), org.hamcrest.Matchers.containsString("i18n.tpl"));
}
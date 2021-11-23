@org.junit.Test
public void defaultLocale() throws java.lang.Exception {
    this.resolver.setDefaultLocale(java.util.Locale.JAPANESE);
    org.springframework.mock.web.test.MockHttpServletRequest request = new org.springframework.mock.web.test.MockHttpServletRequest();
    org.junit.Assert.assertEquals(java.util.Locale.JAPANESE, this.resolver.resolveLocale(request));
    request.addHeader("Accept-Language", java.util.Locale.US.toString());
    request.setPreferredLocales(java.util.Collections.singletonList(java.util.Locale.US));
    org.junit.Assert.assertEquals(java.util.Locale.US, this.resolver.resolveLocale(request));
}
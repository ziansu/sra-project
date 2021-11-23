@org.junit.Test
public void resolvePreferredNotSupported() throws java.lang.Exception {
    this.resolver.setSupportedLocales(java.util.Collections.singletonList(java.util.Locale.CANADA));
    assertEquals(java.util.Locale.US, this.resolver.resolveLocale(request(java.util.Locale.US, java.util.Locale.UK)));
}
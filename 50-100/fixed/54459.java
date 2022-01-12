@java.lang.Override
public void setUp() throws java.lang.Exception {
    super.setUp();
    tester = org.apache.openmeetings.AbstractWicketTester.getWicketTester();
    org.junit.Assert.assertNotNull("Web session should not be null", org.apache.openmeetings.web.app.WebSession.get());
    java.util.Locale[] locales = java.util.Locale.getAvailableLocales();
    tester.getSession().setLocale(locales[rnd.nextInt(locales.length)]);
}
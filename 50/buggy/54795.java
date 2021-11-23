private static void assertTxt(final java.lang.String url, final java.util.Date lastModified, final long ifModifiedSince, final boolean expectNotModified) throws java.io.IOException {
    com.exedio.cope.pattern.webtest.MediaServletTest.assertTxt(url, "text/plain", lastModified, ifModifiedSince, expectNotModified);
}
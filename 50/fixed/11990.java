private void assertBin(final java.lang.String url, final java.lang.String contentType, final java.util.Date lastModified, final java.lang.String cacheControl) throws java.io.IOException {
    assertBin(url, contentType, lastModified, cacheControl, 5000);
}
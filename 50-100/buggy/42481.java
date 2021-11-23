private java.lang.String getResponse(java.net.URI uri) throws java.io.IOException {
    java.net.HttpURLConnection http = ((java.net.HttpURLConnection) (uri.toURL().openConnection()));
    org.junit.Assert.assertThat("Valid Response Code", http.getResponseCode(), org.hamcrest.Matchers.anyOf(is(200), is(404)));
    try (java.io.InputStream in = http.getInputStream()) {
        return org.eclipse.jetty.util.IO.toString(in, java.nio.charset.StandardCharsets.UTF_8);
    }
}
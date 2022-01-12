@org.junit.Test
public void testAcesUp() {
    org.doctester.testbrowser.Response response = makeRequest(org.doctester.testbrowser.Request.GET().url(testServerUrl().path(URL_ACES_UP)));
    org.junit.Assert.assertThat(response.payload, org.hamcrest.CoreMatchers.containsString("Aces Up"));
    org.junit.Assert.assertThat(response.payload, org.hamcrest.CoreMatchers.containsString("columnOfCards"));
}
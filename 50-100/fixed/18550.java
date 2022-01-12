@org.junit.Test
public void testAcesUp() {
    org.doctester.testbrowser.Response response = makeRequest(org.doctester.testbrowser.Request.GET().url(testServerUrl().path(URL_ACES_UP)));
    assertThat(response.payload, org.hamcrest.CoreMatchers.containsString("Aces Up"));
    assertThat(response.payload, org.hamcrest.CoreMatchers.containsString("columnOfCards"));
}
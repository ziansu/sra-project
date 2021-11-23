@org.junit.Test
public void testPlayButton() {
    org.doctester.testbrowser.Response response = makeRequest(org.doctester.testbrowser.Request.GET().url(testServerUrl().path(URL_INDEX)));
    assertThat(response.payload, org.hamcrest.CoreMatchers.containsString("playButton"));
}
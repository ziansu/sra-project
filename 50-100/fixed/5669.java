@org.junit.Test
public void testRoundTrip() throws java.lang.Exception {
    hudson.model.FreeStyleProject p = createFreeStyleProject();
    hudson.plugins.testng.Publisher before = new hudson.plugins.testng.Publisher("", false, false, true, false, 0, 0, 0, 0, 1);
    p.getPublishersList().add(before);
    submit(createWebClient().getPage(p, "configure").getFormByName("config"));
    hudson.plugins.testng.Publisher after = p.getPublishersList().get(hudson.plugins.testng.Publisher.class);
    assertEqualBeans(before, after, "reportFilenamePattern,escapeTestDescp,escapeExceptionMsg,showFailedBuilds");
}
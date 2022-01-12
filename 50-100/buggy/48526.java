@org.junit.Test
public void test_explicit_defaultCredentialsFile() {
    java.io.File file = com.here.account.oauth2.tutorial.GetHereClientCredentialsAccessTokenTutorial.getDefaultCredentialsFile();
    java.lang.String path = (null != file) ? file.getAbsolutePath() : "broken";
    java.lang.String[] args = new java.lang.String[]{ path };
    com.here.account.oauth2.tutorial.GetHereClientCredentialsAccessTokenTutorial tutorial = com.here.account.oauth2.tutorial.GetHereClientCredentialsAccessTokenTutorialTest.mockTutorial(args);
    if (null == file) {
        com.here.account.oauth2.tutorial.GetHereClientCredentialsAccessTokenTutorialTest.setTestCreds(tutorial, com.here.account.oauth2.tutorial.Helper.getSystemCredentials());
    }
    tutorial.getToken();
}
@org.junit.Test
public void test_noArgs_defaultCredentialsFile() {
    java.io.File file = com.here.account.oauth2.tutorial.GetHereClientCredentialsAccessTokenTutorial.getDefaultCredentialsFile();
    java.lang.String[] args = new java.lang.String[]{  };
    com.here.account.oauth2.tutorial.GetHereClientCredentialsAccessTokenTutorial tutorial = com.here.account.oauth2.tutorial.GetHereClientCredentialsAccessTokenTutorialTest.mockTutorial(args);
    if (null == file) {
        com.here.account.oauth2.tutorial.Helper.setTestCreds(tutorial, com.here.account.oauth2.tutorial.Helper.getSystemCredentials());
    }
    tutorial.getToken();
}
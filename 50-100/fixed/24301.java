@org.junit.Test
public void test_id_token() {
    java.io.File file = com.here.account.oauth2.tutorial.GetHereClientCredentialsIdTokenTutorial.getDefaultCredentialsFile();
    java.lang.String path = (null != file) ? file.getAbsolutePath() : "broken";
    java.lang.String[] args = new java.lang.String[]{ path };
    com.here.account.oauth2.tutorial.GetHereClientCredentialsIdTokenTutorial tutorial = com.here.account.oauth2.tutorial.GetHereClientCredentialsIdTokenTutorialTest.mockTutorial(args);
    if (null == file) {
        com.here.account.oauth2.tutorial.Helper.setTestCreds(tutorial, com.here.account.oauth2.tutorial.Helper.getSystemCredentials());
    }
    java.lang.String idToken = tutorial.getToken();
    org.junit.Assert.assertNotNull(idToken);
}
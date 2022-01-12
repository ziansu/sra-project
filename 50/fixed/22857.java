@org.junit.Test
public void responseStatusCodeSuccessful_noError() throws java.lang.Exception {
    final boolean successful = samlLogoutResponseValidator.responseStatusCodeSuccessful(FILE_UNSIGNED_LOGOUT_RESPONSE);
    org.junit.Assert.assertTrue(successful);
}
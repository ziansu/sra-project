@org.junit.Test
public void responseStatusCodeSuccessful_hasError() throws java.lang.Exception {
    final boolean successful = samlLogoutResponseValidator.responseStatusCodeSuccessful(FILE_UNSIGNED_LOGOUT_RESPONSE_ERROR_STATUS);
    org.junit.Assert.assertFalse(successful);
}
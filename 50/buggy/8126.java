@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void getUserOperations_shouldThrowIllegalArgumentExceptionWhenUserIsNull() throws java.lang.Exception {
    service.getUserOperations(null, null, null, null, null);
}
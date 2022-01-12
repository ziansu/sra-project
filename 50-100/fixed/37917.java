@org.junit.Test
public void validateError() throws java.lang.Exception {
    final java.lang.String password = "KlarText";
    java.util.List<java.lang.String> errors = null;
    final boolean result = passwordService.valdidate(password);
    errors = passwordService.getErrors();
    org.junit.Assert.assertThat(result, org.hamcrest.CoreMatchers.is(false));
    org.junit.Assert.assertThat(errors.size(), org.hamcrest.CoreMatchers.is(1));
}
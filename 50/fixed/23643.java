@org.junit.Test(expected = javax.validation.ValidationException.class)
public void noNameThrowsAValidationException() throws java.lang.Exception {
    testObject.processInput(new java.lang.String[]{  }, new java.lang.String[]{  }, null, "local", "wibble", "gradle", null, null);
}
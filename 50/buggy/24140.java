@org.junit.Test(expected = javax.validation.ValidationException.class)
public void noDeployThrowsAValidationException() throws java.lang.Exception {
    testObject.processInput(new java.lang.String[]{  }, new java.lang.String[]{  }, "wibble", null, "wibble", "gradle");
}
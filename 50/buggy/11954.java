@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void invalidDeployThrowsAIllegalArgumentException() throws java.lang.Exception {
    testObject.processInput(new java.lang.String[]{  }, new java.lang.String[]{  }, "wibble", "invalid", "wibble", "gradle");
}
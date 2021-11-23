@org.junit.Test
public void convertBelowHundred() throws java.lang.Exception {
    io.akeredolu.Decision.convertbelowHundred(1);
    java.lang.String actual = io.akeredolu.Decision.convertbelowHundred(1);
    java.lang.String expected = "One";
    org.junit.Assert.assertEquals(actual, expected);
}
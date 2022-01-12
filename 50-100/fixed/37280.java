@org.junit.Test
public void testWrongIndex() throws java.lang.Exception {
    org.piwik.sdk.CustomVariables cv = new org.piwik.sdk.CustomVariables();
    cv.put(1, "name", "value");
    cv.put((-1), "name-1", "value");
    org.junit.Assert.assertEquals("{\"1\":[\"name\",\"value\"]}", cv.toString());
}
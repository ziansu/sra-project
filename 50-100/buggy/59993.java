@org.junit.Test
public void testGetArrayProperty() {
    java.lang.String testKey = "key";
    java.lang.String testValue = "a,b,c";
    org.mockito.Mockito.when(environment.getProperty(testKey)).thenReturn(testValue);
    java.lang.String[] result = config.getArrayProperty(testKey, "");
    org.junit.Assert.assertEquals(3, result.length);
    org.junit.Assert.assertEquals("a", result[0]);
    org.junit.Assert.assertEquals("b", result[1]);
    org.junit.Assert.assertEquals("c", result[2]);
}
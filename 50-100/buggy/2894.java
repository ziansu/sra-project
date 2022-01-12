@org.junit.Test
public void testGetProperties() throws java.lang.Exception {
    java.util.Map<java.lang.String, java.lang.String> props = envPropertySource.getProperties();
    for (java.util.Map.Entry<java.lang.String, java.lang.String> en : props.entrySet()) {
        if (en.getKey().startsWith("_")) {
            org.junit.Assert.assertEquals(envPropertySource.getName(), en.getValue());
        }else {
            org.junit.Assert.assertEquals(java.lang.System.getenv(en.getKey()), en.getValue());
        }
    }
}
@org.junit.Test
public void testGetLocationOfClass() throws java.lang.Exception {
    org.junit.Assert.assertThat(com.firefly.utils.lang.TypeUtils.getLocationOfClass(org.junit.Assert.class).toASCIIString(), org.hamcrest.Matchers.containsString("repository"));
    org.junit.Assert.assertThat(com.firefly.utils.lang.TypeUtils.getLocationOfClass(com.firefly.utils.lang.TypeUtils.class).toASCIIString(), org.hamcrest.Matchers.containsString("/classes/"));
    java.lang.String expectedJavaBase = "/rt.jar";
    if (com.firefly.utils.lang.JDK.IS_9)
        expectedJavaBase = "/java.base/";
    
    org.junit.Assert.assertThat(com.firefly.utils.lang.TypeUtils.getLocationOfClass(java.lang.String.class).toASCIIString(), org.hamcrest.Matchers.containsString(expectedJavaBase));
}
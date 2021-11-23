@org.junit.Test
public void getCommonPropertyType() {
    org.junit.Assert.assertThat(resolver.getCommonPropertyType(null, new java.lang.Object()), org.hamcrest.CoreMatchers.isA(java.lang.Object.class));
}
@org.junit.Test
public void getCommonPropertyType() {
    org.junit.Assert.assertThat(resolver.getCommonPropertyType(null, null), org.hamcrest.CoreMatchers.isA(java.lang.Object.class));
}
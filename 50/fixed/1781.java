public void assertSelf(java.lang.String expectHost) {
    org.junit.Assert.assertNotNull(getTraceContext());
    org.junit.Assert.assertThat(getTraceContext(), org.hamcrest.CoreMatchers.endsWith(expectHost));
}
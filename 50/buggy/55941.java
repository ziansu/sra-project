public void hasReceivedRequestThatContains(java.lang.String expected) {
    org.junit.Assert.assertThat(lastReceivedRequest, org.hamcrest.Matchers.containsString(expected));
}
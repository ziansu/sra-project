public void hasNotReceivedGetRequest() {
    assertThat(receivedGETRequest, org.hamcrest.Matchers.is(org.hamcrest.CoreMatchers.equalTo(false)));
}
@java.lang.Override
public void handleResponse(org.elasticsearch.transport.AbstractSimpleTransportTestCase.Version1Response response) {
    assertThat(response.value1, org.hamcrest.Matchers.equalTo(1));
    assertThat(response.value2, org.hamcrest.Matchers.equalTo(2));
}
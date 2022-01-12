private void createStub(int status) {
    stubFor(any(urlPathMatching("([a-zA-Z0-9/])")).withHeader(no.difi.statistics.ingest.client.IngestClientTest.content_type, equalTo("application/json")).withHeader(no.difi.statistics.ingest.client.IngestClientTest.authorization, equalTo(validAuthHeader())).withRequestBody(equalToJson(no.difi.statistics.ingest.client.IngestClientTest.expected_json, JSONCompareMode.NON_EXTENSIBLE)).willReturn(aResponse().withStatus(status)));
}
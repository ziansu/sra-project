@org.junit.Test
public void shouldSucceedWhenValidRequestWithAuthorizationForHour() throws java.lang.Exception {
    createStub(java.net.HttpURLConnection.HTTP_OK);
    ingestClient.ingest(no.difi.statistics.ingest.client.model.TimeSeriesDefinition.builder().name(no.difi.statistics.ingest.client.IngestClientTest.series_name).distance(no.difi.statistics.ingest.client.model.MeasurementDistance.minutes), timeSeriesPoint);
    com.github.tomakehurst.wiremock.client.WireMock.verify(com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor(com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo(no.difi.statistics.ingest.client.IngestClientTest.valid_url)).withHeader(no.difi.statistics.ingest.client.IngestClientTest.content_type, com.github.tomakehurst.wiremock.client.WireMock.equalTo(no.difi.statistics.ingest.client.IngestClientTest.JSON)));
}
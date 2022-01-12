@org.junit.Test
public void shouldFailWithIngestFailExceptionWhenNotFound() {
    createWiremockStub(java.net.HttpURLConnection.HTTP_NOT_FOUND);
    expectedEx.expect(IngestService.Failed.class);
    ingestClient.ingest(createTimeSeriesDefinitionValid(), createTimeSeriesPointValid());
}
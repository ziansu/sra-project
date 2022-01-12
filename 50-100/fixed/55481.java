@org.junit.Test
public void testTagWithUniqueIdsAndTableProjectNotNull() {
    com.google.cloud.dataflow.sdk.options.BigQueryOptions bqOptions = com.google.cloud.dataflow.sdk.testing.TestPipeline.testingPipelineOptions().as(com.google.cloud.dataflow.sdk.options.BigQueryOptions.class);
    com.google.api.services.bigquery.model.TableReference table = com.google.cloud.dataflow.sdk.io.BigQueryIO.parseTableSpec("data_set.table_name");
    com.google.cloud.dataflow.sdk.io.BigQueryIO.TagWithUniqueIdsAndTable tag = new com.google.cloud.dataflow.sdk.io.BigQueryIO.TagWithUniqueIdsAndTable(bqOptions, com.google.cloud.dataflow.sdk.options.ValueProvider.StaticValueProvider.of(table), null);
    table = com.google.cloud.dataflow.sdk.io.BigQueryIO.parseTableSpec(tag.getTableSpec().get());
    org.junit.Assert.assertNotNull(table.getProjectId());
}
@org.apache.beam.sdk.io.gcp.bigquery.ProcessElement
public void getTempFilePrefix(org.apache.beam.sdk.io.gcp.bigquery.ProcessContext c) {
    java.lang.String tempLocationRoot;
    if (customGcsTempLocation.isAccessible()) {
        tempLocationRoot = c.getPipelineOptions().getTempLocation();
    }else {
        tempLocationRoot = customGcsTempLocation.get();
    }
    java.lang.String tempLocation = org.apache.beam.sdk.io.gcp.bigquery.BigQueryHelpers.resolveTempLocation(tempLocationRoot, "BigQueryWriteTemp", c.element());
    org.apache.beam.sdk.io.gcp.bigquery.BatchLoads.LOG.info("Writing BigQuery temporary files to {} before loading them.", tempLocation);
    c.output(tempLocation);
}
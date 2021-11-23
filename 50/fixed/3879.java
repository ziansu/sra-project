org.apache.beam.sdk.io.gcp.bigquery.StreamingInserts<DestinationT> withTestServices(org.apache.beam.sdk.io.gcp.bigquery.BigQueryServices bigQueryServices) {
    return new org.apache.beam.sdk.io.gcp.bigquery.StreamingInserts<DestinationT>(createDisposition, dynamicDestinations, bigQueryServices, retryPolicy);
}
private com.google.cloud.dataflow.sdk.util.BigQueryServices getBigQueryServices() {
    if ((testBigQueryServices) == null) {
        testBigQueryServices = new com.google.cloud.dataflow.sdk.util.BigQueryServicesImpl();
    }
    return testBigQueryServices;
}
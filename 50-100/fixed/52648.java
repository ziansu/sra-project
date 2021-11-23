@java.lang.Override
public void configure(org.apache.flink.configuration.Configuration parameters) {
    es.accenture.flink.Sources.KuduInputFormat.LOG.info("2. CONFIGURE");
    es.accenture.flink.Sources.KuduInputFormat.LOG.info("Initializing KUDU Configuration...");
    this.client = new es.accenture.flink.Sources.KuduClient.KuduClientBuilder(es.accenture.flink.Sources.KuduInputFormat.KUDU_MASTER).build();
    table = createTable(es.accenture.flink.Sources.KuduInputFormat.TABLE_NAME);
    if ((table) != null) {
        scanner = client.newScannerBuilder(table).setProjectedColumnNames(projectColumns).build();
    }
}
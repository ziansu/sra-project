@java.lang.Override
protected void configure() {
    bind(com.googlesource.gerrit.plugins.verifystatus.server.schema.SchemaVersion.class).to(SchemaVersion.C);
    bind(com.google.gerrit.metrics.MetricMaker.class).to(com.google.gerrit.metrics.DisabledMetricMaker.class);
}
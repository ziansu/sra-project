@java.lang.Override
public void initialize(io.dropwizard.setup.Bootstrap<com.srotya.monitoring.kafka.KafkaMonitorConfiguration> bootstrap) {
    bootstrap.addBundle(new io.dropwizard.assets.AssetsBundle("/web", "/", "index.html"));
}
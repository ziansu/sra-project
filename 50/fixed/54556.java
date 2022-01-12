@java.lang.Override
public void open() {
    if ((service) == null) {
        org.metricssampler.resources.SamplerStats.get().incConnectCount();
        service = loadCommandService();
    }
    if ((service) == null) {
        throw new org.metricssampler.extensions.oranosql.OpenMetricsReaderException("Failed to open command service api to the admin");
    }
}
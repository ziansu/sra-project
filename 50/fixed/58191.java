@java.lang.Override
public void onFailure(final java.lang.Throwable throwable) {
    org.opendaylight.protocol.bgp.benchmark.app.AppPeerBenchmark.LOG.error("Failed to create Empty Structure for Application Peer Benchmark {}", this.appRibId, throwable);
}
@org.junit.Test
public void testScan() {
    logger.debug("Scanning a sample database {}", discoveryService);
    org.alcibiade.pandiscovery.db.model.DiscoveryReport report = discoveryService.runDiscovery();
    org.assertj.core.api.Assertions.assertThat(report.getFields()).isEmpty();
}
@org.junit.Test
public void shouldBuild() {
    final org.araymond.joal.core.config.JoalConfigProvider configProvider = org.mockito.Mockito.mock(org.araymond.joal.core.config.JoalConfigProvider.class);
    final org.araymond.joal.core.config.AppConfiguration conf = org.mockito.Mockito.mock(org.araymond.joal.core.config.AppConfiguration.class);
    org.mockito.Mockito.when(configProvider.get()).thenReturn(conf);
    org.mockito.Mockito.when(conf.getSimultaneousSeed()).thenReturn(3);
    try {
        final org.araymond.joal.core.ttorent.client.bandwidth.BandwidthDispatcher bandwidthDispatcher = new org.araymond.joal.core.ttorent.client.bandwidth.BandwidthDispatcher(configProvider);
    } catch (final java.lang.Throwable throwable) {
        fail("should build", throwable);
    }
}
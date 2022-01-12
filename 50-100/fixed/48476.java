@org.junit.Test
public void testBuilderSetsPskCipherSuitesWhenPskStoreIsSet() {
    org.eclipse.californium.scandium.config.DtlsConnectorConfig config = builder.setPskStore(new org.eclipse.californium.scandium.dtls.pskstore.StaticPskStore("ID", "KEY".getBytes())).build();
    assertTrue(((config.getSupportedCipherSuites().length) > 0));
    for (org.eclipse.californium.scandium.dtls.cipher.CipherSuite suite : config.getSupportedCipherSuites()) {
        assertThat(suite.getKeyExchange(), is(KeyExchangeAlgorithm.PSK));
    }
}
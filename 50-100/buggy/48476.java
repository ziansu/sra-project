@org.junit.Test
public void testBuilderSetsPskCipherSuitesWhenPskStoreIsSet() {
    org.eclipse.californium.scandium.config.DtlsConnectorConfig config = builder.setPskStore(new org.eclipse.californium.scandium.dtls.pskstore.StaticPskStore("ID", "KEY".getBytes())).build();
    org.junit.Assert.assertTrue(((config.getSupportedCipherSuites().length) > 0));
    for (org.eclipse.californium.scandium.dtls.cipher.CipherSuite suite : config.getSupportedCipherSuites()) {
        org.junit.Assert.assertThat(suite.getKeyExchange(), org.hamcrest.CoreMatchers.is(KeyExchangeAlgorithm.PSK));
    }
}
@org.junit.Test
public void testBuilderSetsEcdhCipherSuiteWhenKeysAreSet() throws java.lang.Exception {
    org.eclipse.californium.scandium.config.DtlsConnectorConfig config = builder.setIdentity(org.eclipse.californium.scandium.dtls.DtlsTestTools.getPrivateKey(), org.eclipse.californium.scandium.dtls.DtlsTestTools.getPublicKey()).build();
    assertTrue(((config.getSupportedCipherSuites().length) > 0));
    for (org.eclipse.californium.scandium.dtls.cipher.CipherSuite suite : config.getSupportedCipherSuites()) {
        assertThat(suite.getKeyExchange(), is(KeyExchangeAlgorithm.EC_DIFFIE_HELLMAN));
    }
}
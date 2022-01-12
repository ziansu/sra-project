@org.junit.Test
public void testBuilderSetsEcdhCipherSuiteWhenKeysAreSet() throws java.lang.Exception {
    org.eclipse.californium.scandium.config.DtlsConnectorConfig config = builder.setIdentity(org.eclipse.californium.scandium.dtls.DtlsTestTools.getPrivateKey(), org.eclipse.californium.scandium.dtls.DtlsTestTools.getPublicKey()).build();
    org.junit.Assert.assertTrue(((config.getSupportedCipherSuites().length) > 0));
    for (org.eclipse.californium.scandium.dtls.cipher.CipherSuite suite : config.getSupportedCipherSuites()) {
        org.junit.Assert.assertThat(suite.getKeyExchange(), org.hamcrest.CoreMatchers.is(KeyExchangeAlgorithm.EC_DIFFIE_HELLMAN));
    }
}
@org.junit.Test
public void testCheckSenderPartyTrustDisabled() throws java.lang.Exception {
    final java.security.cert.X509Certificate certificate = pkiUtil.createCertificate(java.math.BigInteger.ONE, null);
    new mockit.Expectations() {
        {
            domibusProperties.getProperty(TrustSenderInterceptor.DOMIBUS_SENDER_TRUST_VALIDATION_ONRECEIVING, "false");
            result = "false";
        }
    };
    org.junit.Assert.assertTrue(trustSenderInterceptor.checkSenderPartyTrust(certificate, "test sender", "messageID123"));
}
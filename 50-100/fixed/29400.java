@org.junit.Test
public void testCheckSenderPartyTrust() throws java.lang.Exception {
    final java.security.cert.X509Certificate certificate = pkiUtil.createCertificate(java.math.BigInteger.ONE, null);
    new mockit.Expectations() {
        {
            domibusProperties.getProperty(TrustSenderInterceptor.DOMIBUS_SENDER_TRUST_VALIDATION_ONRECEIVING, "false");
            result = "true";
        }
    };
    org.junit.Assert.assertTrue(trustSenderInterceptor.checkSenderPartyTrust(certificate, "GlobalSign", "messageID123", false));
    org.junit.Assert.assertFalse(trustSenderInterceptor.checkSenderPartyTrust(certificate, "test sender", "messageID123", false));
}
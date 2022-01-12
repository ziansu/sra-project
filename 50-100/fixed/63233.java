@org.junit.Test
public void testSetIdentityRequiresPrivateAndPublicKey() throws java.io.IOException, java.security.GeneralSecurityException {
    java.security.PrivateKey privateKey = org.eclipse.californium.scandium.dtls.DtlsTestTools.getPrivateKey();
    java.security.PublicKey publicKey = org.eclipse.californium.scandium.dtls.DtlsTestTools.getPublicKey();
    try {
        builder.setIdentity(privateKey, null);
        fail("Should have rejected null as public key");
    } catch (java.lang.NullPointerException e) {
    }
    try {
        builder.setIdentity(null, publicKey);
        fail("Should have rejected null as private key");
    } catch (java.lang.NullPointerException e) {
    }
}
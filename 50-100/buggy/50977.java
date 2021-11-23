@org.junit.Test
public void testExtractFailures() throws java.lang.Exception {
    try {
        at.favre.crypto.HKDF.extractHmacSha256(null, org.apache.commons.lang3.RandomUtils.nextBytes(10));
        org.junit.Assert.fail();
    } catch (java.lang.Exception e) {
    }
    try {
        at.favre.crypto.HKDF.extractHmacSha512(new byte[0], null);
        org.junit.Assert.fail();
    } catch (java.lang.Exception e) {
    }
}
@org.junit.Test
public void testVerifyHashResultByteArrayWrongSizeMac() {
    for (int i = 0; i < (freenet.crypt.HashTest.types.length); i++) {
        byte[] hash1 = freenet.crypt.HashTest.helloWorld;
        freenet.crypt.HashResult hashResult = new freenet.crypt.HashResult(freenet.crypt.HashTest.types[i], hash1, true);
        assertFalse(("HashType: " + (freenet.crypt.HashTest.types[i].name())), freenet.crypt.Hash.verify(hashResult, hash1));
    }
}
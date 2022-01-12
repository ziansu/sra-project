@org.junit.Test
public void generateRandomKey() {
    byte[] generatedHash = new byte[0];
    try {
        generatedHash = org.fides.encryption.KeyGenerator.generateRandomKey("AES", keySize).getEncoded();
    } catch (java.security.NoSuchAlgorithmException e) {
        e.printStackTrace();
    }
    org.junit.Assert.assertEquals(keySize, generatedHash.length);
}
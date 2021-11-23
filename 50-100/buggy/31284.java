@org.junit.Test
public void testModifiedCiphertext() throws java.lang.Exception {
    byte[] ikm = com.google.crypto.tink.TestUtil.hexDecode("000102030405060708090a0b0c0d0e0f");
    int keySize = 16;
    int tagSize = 12;
    int segmentSize = 256;
    int offset = 8;
    int plaintextSize = 512;
    com.google.crypto.tink.subtle.AesCtrHmacStreaming ags = new com.google.crypto.tink.subtle.AesCtrHmacStreaming(ikm, keySize, tagSize, segmentSize, offset);
    com.google.crypto.tink.StreamingTestUtil.testModifiedCiphertext(ags, segmentSize, offset);
}
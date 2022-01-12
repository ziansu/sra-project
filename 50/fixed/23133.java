public void importKey(byte[] key) throws java.io.IOException {
    runGPG(java.util.Arrays.asList("--import"), key);
}
public void importKey(java.io.InputStream key) throws java.io.IOException {
    runGPG(java.util.Arrays.asList("--import"), key);
}
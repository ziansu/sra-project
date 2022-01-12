@com.github.davidmoten.guavamini.annotations.VisibleForTesting
static byte[] readFully(java.io.InputStream is, int numBytes) throws java.io.IOException {
    byte[] b = new byte[numBytes];
    int n = is.read(b);
    if (n != numBytes)
        throw new java.lang.RuntimeException("unexpected");
    
    return b;
}
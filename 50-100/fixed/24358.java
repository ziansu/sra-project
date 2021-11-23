@com.github.davidmoten.guavamini.annotations.VisibleForTesting
static byte[] readFully(java.io.InputStream is, int numBytes) throws java.io.IOException {
    byte[] b = new byte[numBytes];
    int count = 0;
    do {
        int n = is.read(b, count, (numBytes - count));
        if (n > 0) {
            count += n;
        }else {
            throw new java.lang.RuntimeException("unexpected");
        }
    } while (count < numBytes );
    return b;
}
private static void skipFully(java.io.InputStream s, long n) throws java.io.IOException {
    long skipped;
    long total = 0;
    while (total < n) {
        skipped = s.skip((n - total));
        if (skipped <= 0)
            throw new java.io.EOFException();
        
        total += skipped;
    } 
}
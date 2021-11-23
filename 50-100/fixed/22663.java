protected static int readFromStream(java.io.InputStream stream, byte[] buffer, int offset, int expected) throws java.io.IOException {
    int toRead = expected;
    int totalRead = 0;
    do {
        int bytesRead = stream.read(buffer, offset, toRead);
        if (bytesRead < 0)
            return totalRead;
        
        if (bytesRead == 0)
            return totalRead;
        
        totalRead += bytesRead;
        offset += bytesRead;
        toRead = expected - totalRead;
    } while (totalRead < expected );
    return totalRead;
}
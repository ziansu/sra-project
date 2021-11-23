@java.lang.Override
public void close() throws java.io.IOException {
    while ((nextRow) < (getCount())) {
        java.lang.String line = reader.readLine();
        if (line == null) {
            throw new java.io.IOException("Unexpected end of file.");
        }
    } 
    closed = true;
}
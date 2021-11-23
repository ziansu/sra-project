void readFromStream() {
    try {
        len = inputStream.read(bytes);
        pos = 0;
    } catch (java.io.IOException ioe) {
        throw new java.lang.RuntimeException(ioe);
    }
}
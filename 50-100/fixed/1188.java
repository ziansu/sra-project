public synchronized byte[] read(java.lang.String filename, int offset) throws java.io.FileNotFoundException, java.io.IOException {
    byte[] data = new byte[bufferSize];
    java.io.BufferedInputStream reader = new java.io.BufferedInputStream(new java.io.FileInputStream(filename));
    reader.read(data, offset, bufferSize);
    reader.close();
    return data;
}
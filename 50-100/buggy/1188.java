public synchronized byte[] read(java.lang.String fn, int offset) throws java.io.FileNotFoundException, java.io.IOException {
    java.io.File filename = new java.io.File(fn);
    java.io.File f2 = filename.getCanonicalFile();
    java.lang.String s = f2.getAbsolutePath();
    java.io.FileInputStream fis = new java.io.FileInputStream(s);
    byte[] data = new byte[bufferSize];
    java.io.BufferedInputStream reader = new java.io.BufferedInputStream(fis);
    reader.read(data, offset, bufferSize);
    reader.close();
    return data;
}
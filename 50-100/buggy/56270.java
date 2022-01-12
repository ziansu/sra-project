public synchronized void write(java.lang.String file, byte[] data) throws java.io.IOException {
    java.lang.String s = new java.lang.String(data);
    java.io.BufferedWriter w = new java.io.BufferedWriter(new java.io.FileWriter(file, true));
    w.write(s);
    w.close();
}
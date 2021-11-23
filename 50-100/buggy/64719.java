private static byte[] readFile(java.io.File f) throws java.io.IOException {
    byte[] bytes = new byte[((int) (f.length()))];
    new java.io.DataInputStream(new java.io.FileInputStream(f)).readFully(bytes);
    return bytes;
}
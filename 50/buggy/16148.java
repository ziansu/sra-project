static void writeFile(java.io.File file, byte[] transformed) throws java.io.IOException {
    java.io.FileOutputStream out = new java.io.FileOutputStream(file);
    out.write(transformed);
    out.close();
}
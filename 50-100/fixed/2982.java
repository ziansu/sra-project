private static void copyChar(java.io.File file, java.io.OutputStream out) throws innovimax.mixthem.MixException, java.io.IOException {
    java.io.FileInputStream in = new java.io.FileInputStream(file);
    byte[] buffer = new byte[innovimax.mixthem.MixThem.BYTE_BUFFER_SIZE];
    int c;
    while ((c = in.read(buffer)) != (-1)) {
        out.write(buffer, 0, c);
    } 
    in.close();
}
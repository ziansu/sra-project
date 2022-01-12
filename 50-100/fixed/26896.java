public int ConverToInt() {
    bais = new java.io.ByteArrayInputStream(bufferIn);
    dais = new java.io.DataInputStream(bais);
    try {
        output = dais.readInt();
        output = dais.readInt();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return output;
}
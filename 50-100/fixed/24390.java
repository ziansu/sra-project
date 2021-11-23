public byte[] readBytesFull() throws java.io.IOException {
    byte[] buffer = new byte[io.kaitai.struct.KaitaiStream.DEFAULT_BUFFER_SIZE];
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    int readCount;
    while ((-1) != (readCount = st.read(buffer)))
        baos.write(buffer, 0, readCount);
    
    return baos.toByteArray();
}
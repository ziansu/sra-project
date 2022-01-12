public byte[] toByteArray() throws java.io.IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(bos);
    oos.writeObject(this);
    oos.flush();
    oos.close();
    return bos.toByteArray();
}
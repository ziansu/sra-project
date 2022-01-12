private byte[] createByteArray(java.lang.Object sourceObject) throws java.io.IOException {
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
    oos.writeObject(sourceObject);
    oos.flush();
    byte[] byteArray = baos.toByteArray();
    oos.close();
    return byteArray;
}
private byte[] createByteArray(java.lang.Object sourceObject) throws java.io.IOException {
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
    byte[] byteArray = null;
    try {
        oos.writeObject(sourceObject);
        oos.flush();
        byteArray = baos.toByteArray();
    } finally {
        oos.close();
    }
    return byteArray;
}
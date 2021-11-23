private java.lang.Object createNewObject(byte[] byteArray) throws java.io.IOException, java.lang.ClassNotFoundException {
    java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(byteArray);
    java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bais);
    java.lang.Object newObject = ois.readObject();
    ois.close();
    return newObject;
}
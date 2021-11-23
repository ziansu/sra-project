private static java.lang.String toString(java.io.Serializable o) throws java.io.IOException {
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
    oos.writeObject(o);
    oos.close();
    return java.util.Base64.getEncoder().encodeToString(baos.toByteArray());
}
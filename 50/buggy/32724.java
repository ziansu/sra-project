public static byte[] getMessageAsByteArray(com.Message message) throws java.io.IOException {
    java.io.ByteArrayOutputStream bo = new java.io.ByteArrayOutputStream();
    java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(bo);
    out.writeObject(message);
    return bo.toByteArray();
}
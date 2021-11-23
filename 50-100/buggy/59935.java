public static final byte[] toByteArray(java.lang.Object obj) {
    byte[] bytes = null;
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    try {
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(bos);
        oos.writeObject(obj);
        oos.flush();
        bytes = bos.toByteArray();
        oos.close();
        bos.close();
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
    }
    return bytes;
}
public static final java.lang.Object toObject(byte[] bytes) {
    java.lang.Object obj = null;
    try {
        java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(bytes);
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bis);
        obj = ois.readObject();
        ois.close();
        bis.close();
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
    } catch (java.lang.ClassNotFoundException ex) {
        ex.printStackTrace();
    }
    return obj;
}
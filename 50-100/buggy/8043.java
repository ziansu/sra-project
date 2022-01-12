@java.lang.Override
public java.lang.String toString() {
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    java.io.ObjectOutputStream oos = null;
    try {
        oos = new java.io.ObjectOutputStream(baos);
        oos.writeObject(this);
        oos.close();
        return new java.lang.String(com.infmme.readily.util.Base64Coder.encode(baos.toByteArray()));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}
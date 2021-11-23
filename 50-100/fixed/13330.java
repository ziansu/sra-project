@java.lang.Override
public java.io.Serializable convert(java.lang.String value) {
    if (value == null) {
        return null;
    }
    try {
        java.io.ObjectInputStream in = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(android.util.Base64.decode(value, Base64.DEFAULT)));
        return ((java.io.Serializable) (in.readObject()));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}
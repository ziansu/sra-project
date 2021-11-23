@java.lang.Override
public java.io.Serializable convert(java.lang.String value) {
    try {
        java.io.ObjectInputStream in = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(android.util.Base64.decode(value, Base64.DEFAULT)));
        return ((java.io.Serializable) (in.readObject()));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    }
    return null;
}
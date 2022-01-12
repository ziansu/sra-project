@java.lang.Override
public java.lang.String convert(java.io.Serializable value) {
    if (value == null) {
        return null;
    }
    java.io.ByteArrayOutputStream byteOutputStream = new java.io.ByteArrayOutputStream();
    try {
        java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(byteOutputStream);
        out.writeObject(value);
        out.close();
        return android.util.Base64.encodeToString(byteOutputStream.toByteArray(), Base64.DEFAULT);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}
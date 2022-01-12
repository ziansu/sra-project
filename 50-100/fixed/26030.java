public java.lang.Object deserialize(byte[] bytes, org.activiti.engine.impl.variable.ValueFields valueFields) {
    java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(bytes);
    try {
        java.io.ObjectInputStream ois = createObjectInputStream(bais);
        java.lang.Object deserializedObject = ois.readObject();
        return deserializedObject;
    } catch (java.lang.Exception e) {
        return null;
    } finally {
        org.activiti.engine.impl.util.IoUtil.closeSilently(bais);
    }
}
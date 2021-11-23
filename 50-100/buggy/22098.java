private int getPrefixIndexMinLength() {
    int length = com.emc.storageos.db.client.model.DataObject.DEFAULT_MIN_LABEL_LENGTH;
    try {
        java.lang.reflect.Method method = com.emc.storageos.db.client.model.DataObject.class.getDeclaredMethod(com.emc.storageos.db.client.model.DataObject.READ_LABEL_METHOD_NAME, new java.lang.Class<?>[]{ java.lang.String.class });
        com.emc.storageos.db.client.model.PrefixIndex annotation = method.getAnnotation(com.emc.storageos.db.client.model.PrefixIndex.class);
        length = annotation.minChars();
    } catch (java.lang.Exception e) {
        com.emc.storageos.db.client.model.DataObject._log.error("get declared method error:", e);
    }
    return length;
}
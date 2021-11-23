public com.google.gson.JsonElement view(java.lang.Object obj, java.lang.Class<?> objectClass, java.lang.Class<? extends pt.ist.bennu.json.JsonViewer> jsonViewerClass) {
    if (objectClass == null) {
        return null;
    }
    if (java.util.Collection.class.isAssignableFrom(objectClass)) {
        return views(((java.util.Collection) (obj)), jsonViewerClass);
    }
    return viewers.get(objectClass, jsonViewerClass).view(obj, this);
}
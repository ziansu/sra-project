public java.lang.Object retrieve(java.lang.String id) {
    java.lang.ref.WeakReference<java.lang.Object> objectWeakReference = data.get(id);
    if (objectWeakReference != null) {
        data.remove(id);
        return objectWeakReference.get();
    }
    return null;
}
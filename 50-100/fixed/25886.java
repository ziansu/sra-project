private java.lang.reflect.Field findObserverField(java.lang.String mappedBy, java.lang.Class<?> observableClass) {
    java.lang.reflect.Field observerField = null;
    for (java.lang.Class<?> klass = observableClass; (null != klass) && (klass != (java.lang.Object.class)); klass = klass.getSuperclass()) {
        try {
            observerField = klass.getDeclaredField(mappedBy);
            break;
        } catch (java.lang.NoSuchFieldException e) {
            continue;
        } catch (java.lang.SecurityException e) {
            continue;
        }
    }
    return observerField;
}
private java.lang.reflect.Field findObservableField(java.lang.Class<?> klass, java.lang.String observableName) {
    java.lang.reflect.Field declaredField = null;
    for (java.lang.Class<?> clazz = klass; (null != clazz) && (clazz != (java.lang.Object.class)); clazz = clazz.getSuperclass()) {
        try {
            declaredField = clazz.getDeclaredField(observableName);
            break;
        } catch (java.lang.NoSuchFieldException e) {
            continue;
        } catch (java.lang.SecurityException e) {
            continue;
        }
    }
    return declaredField;
}
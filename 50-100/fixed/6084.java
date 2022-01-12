private java.lang.reflect.Field field0(java.lang.String name) throws org.joor.ReflectException {
    java.lang.Class<?> type = type();
    try {
        return org.joor.Reflect.accessible(type.getField(name));
    } catch (java.lang.NoSuchFieldException e) {
        do {
            try {
                return org.joor.Reflect.accessible(type.getDeclaredField(name));
            } catch (java.lang.NoSuchFieldException ignore) {
            }
            type = type.getSuperclass();
        } while (type != null );
        throw new org.joor.ReflectException(e);
    }
}
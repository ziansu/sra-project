public static java.lang.reflect.Method findMethodByName(final java.lang.Class<?> clazz, final java.lang.String name) {
    if (clazz == null) {
        return null;
    }
    for (final java.lang.reflect.Method m : clazz.getMethods()) {
        if (name.equals(m.getName())) {
            return m;
        }
    }
    return null;
}
public static java.lang.Class<?>[] getClass(final java.lang.Object... objects) {
    if (objects == null) {
        return null;
    }
    final java.lang.Class<?>[] classes = new java.lang.Class<?>[objects.length];
    for (int i = 0; i < (objects.length); i++) {
        classes[i] = org.jbromo.common.ClassUtil.getClass(objects[i]);
    }
    return classes;
}
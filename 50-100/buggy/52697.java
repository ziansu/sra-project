@java.lang.Override
public java.lang.Class<?> resolveClass(java.io.ObjectStreamClass streamClass) throws java.io.IOException, java.lang.ClassNotFoundException {
    @java.lang.SuppressWarnings(value = "rawtypes")
    java.lang.Class c = java.lang.Class.forName(streamClass.getName(), false, loader);
    if (c == null) {
        return super.resolveClass(streamClass);
    }else {
        return c;
    }
}
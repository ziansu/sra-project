@java.lang.Override
protected java.lang.Class<?> findClass(final java.lang.String className) throws java.lang.ClassNotFoundException {
    final java.io.ByteArrayOutputStream bos = byteStreams.get(className);
    if (bos == null) {
        return null;
    }
    final byte[] b = bos.toByteArray();
    return super.defineClass(className, b, 0, b.length);
}
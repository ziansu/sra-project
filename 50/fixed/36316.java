private static final void putLong(java.lang.Object obj, long off, long val) {
    org.joml.MemUtil.MemUtilUnsafe.UNSAFE.putLong(obj, off, val);
}
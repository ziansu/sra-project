private byte getClassEid(final java.lang.Class<?> clazz) {
    final java.lang.Short res = classesToIdx.get(clazz);
    if (res == null)
        throw new java.lang.IllegalArgumentException((("Class not in context [" + (clazz.getName())) + "]"));
    
    return res.byteValue();
}
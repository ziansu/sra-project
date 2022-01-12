private void add2SystemTypeCache(java.lang.Class<?> javaClass) {
    assert (javaClass.isPrimitive()) || (javaClass.getPackage().getName().startsWith("java."));
    assert (javaClass.getProtectionDomain().getCodeSource()) == null;
    net.sf.mmm.code.impl.java.JavaRootContext.JavaTypeContainer container = new net.sf.mmm.code.impl.java.JavaRootContext.JavaTypeContainer(javaClass);
    if (javaClass.isPrimitive()) {
        container.javaType = createPrimitiveType(javaClass);
    }
    this.javaSystemTypeCache.put(javaClass.getName(), container);
}
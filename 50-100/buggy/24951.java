@java.lang.Override
protected final java.lang.Class<?> findClass(java.lang.String name) throws java.lang.ClassNotFoundException {
    de.skuzzle.tinyplugz.DelegateClassLoader.LOG.trace("delegate.findClass('{}')", name);
    final java.lang.Class<?> cls = this.delegator.findClass(null, name);
    if (cls == null) {
        throw new java.lang.ClassNotFoundException(name);
    }
    return cls;
}
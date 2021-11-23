@java.lang.Override
protected java.lang.Class<?> findClass(java.lang.String name) throws java.lang.ClassNotFoundException {
    final java.lang.Class<?> cls = this.delegator.findClass(null, name);
    if (cls == null) {
        throw new java.lang.ClassNotFoundException(name);
    }
    return cls;
}
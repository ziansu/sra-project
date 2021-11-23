@java.lang.Override
protected final java.lang.Class<?> findClass(java.lang.String name) throws java.lang.ClassNotFoundException {
    java.lang.System.out.println(("Plugin Class: " + name));
    return findClass(this, name);
}
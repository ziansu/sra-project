public java.lang.Class<?> findClass(java.lang.String name) throws java.lang.ClassNotFoundException {
    if ((((name != null) && (name.startsWith("com.tencent.tinker.loader."))) && (!(name.equals(SystemClassLoaderAdder.CHECK_DEX_CLASS)))) || (((applicationClassName) != null) && (applicationClassName.equals(name)))) {
        return originClassLoader.loadClass(name);
    }
    return super.findClass(name);
}
public java.lang.Class<?> findClass(java.lang.String name) throws java.lang.ClassNotFoundException {
    if (((((name != null) && (name.startsWith("com.tencent.tinker.loader."))) && (!(name.equals(SystemClassLoaderAdder.CHECK_DEX_CLASS)))) && (!(name.equals(com.tencent.tinker.loader.AndroidNClassLoader.CHECK_CLASSLOADER_CLASS)))) || (((applicationClassName) != null) && (android.text.TextUtils.equals(applicationClassName, name)))) {
        return originClassLoader.loadClass(name);
    }
    return super.findClass(name);
}
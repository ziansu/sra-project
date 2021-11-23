@java.lang.Override
protected java.lang.Class<?> findClass(java.lang.String name) throws java.lang.ClassNotFoundException {
    synchronized(this.manager) {
        com.jukta.jtahoe.loader.CompiledJavaObject compiledObject = this.manager.map.remove(name);
        if (compiledObject != null) {
            byte[] array = compiledObject.toByteArray();
            return defineClass(name, array, 0, array.length);
        }
    }
    return super.findClass(name);
}
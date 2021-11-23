@java.lang.Override
public java.lang.Class<?> findClass(java.lang.String name) throws java.lang.ClassNotFoundException {
    de.uni_koblenz.jgralab.schema.impl.compilation.InMemoryClassFile inMemClassFile = schemaClassFiles.get(name);
    if (inMemClassFile != null) {
        byte[] bytes = inMemClassFile.getBytecode();
        java.lang.Class<?> clazz = defineClass(name, bytes, 0, bytes.length);
        schemaClassFiles.remove(name);
        return clazz;
    }
    return java.lang.Class.forName(name);
}
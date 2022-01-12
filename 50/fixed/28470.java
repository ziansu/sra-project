@java.lang.Override
public org.eclipse.jdt.internal.compiler.batch.FileSystem getLibraryAccess() {
    java.lang.ClassLoader contextClassLoader = classLoader;
    return new org.bonitasoft.engine.compiler.ClassLoaderEnvironment(contextClassLoader);
}
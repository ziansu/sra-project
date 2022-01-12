@java.lang.Override
public java.lang.Class<?> loadLanguageClass(java.lang.String className) {
    for (java.lang.ClassLoader loader : com.oracle.truffle.api.impl.TruffleLocator.loaders()) {
        try {
            return loader.loadClass(className);
        } catch (java.lang.ClassNotFoundException e) {
        }
    }
    return null;
}
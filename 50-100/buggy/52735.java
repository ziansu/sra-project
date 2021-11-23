public static java.lang.Object initialize(java.lang.String rootClassName, java.util.List<java.lang.String> implementationClassNames) throws java.lang.Exception {
    ru.spbau.mit.Injector.clear();
    final java.lang.Class<?> clazz = ru.spbau.mit.Injector.loadClass(rootClassName);
    final java.lang.reflect.Constructor<?> constructor = ru.spbau.mit.Injector.getConstructor(clazz);
    final java.lang.Class<?>[] parametrTypes = constructor.getParameterTypes();
    final java.util.ArrayList<java.lang.Class<?>> implementationClasses = ru.spbau.mit.Injector.loadImplementationClasses(implementationClassNames);
    ru.spbau.mit.Injector.root = clazz;
    return ru.spbau.mit.Injector.run(clazz, implementationClasses);
}
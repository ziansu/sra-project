public static java.lang.Object initialize(java.lang.String rootClassName, java.util.List<java.lang.String> implementationClassNames) throws java.lang.Exception {
    ru.spbau.mit.Injector.clear();
    final java.lang.Class<?> clazz = ru.spbau.mit.Injector.loadClass(rootClassName);
    final java.util.ArrayList<java.lang.Class<?>> implementationClasses = ru.spbau.mit.Injector.loadImplementationClasses(clazz, implementationClassNames);
    return ru.spbau.mit.Injector.run(clazz, implementationClasses);
}
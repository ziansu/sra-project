private <T> T get(java.lang.Class<T> clazz, java.util.Set<java.lang.Class<?>> traversedClasses) {
    if (objects.containsKey(clazz)) {
        return clazz.cast(objects.get(clazz));
    }
    ch.jalu.injector.context.UnresolvedInstantiationContext<T> context = new ch.jalu.injector.context.UnresolvedInstantiationContext(this, ch.jalu.injector.context.StandardResolutionType.SINGLETON, clazz);
    T object = instantiate(context, new java.util.HashSet<>(traversedClasses));
    register(clazz, object);
    return object;
}
public <T> void registerWrapperClass(php.runtime.env.CompileScope scope, java.lang.Class<T> clazz, java.lang.Class<? extends php.runtime.lang.BaseWrapper> wrapperClass) {
    if (!(classes.add(wrapperClass))) {
        throw new php.runtime.exceptions.CriticalException(("Class already registered - " + (clazz.getName())));
    }
    php.runtime.memory.support.MemoryOperation.registerWrapper(clazz, wrapperClass);
}
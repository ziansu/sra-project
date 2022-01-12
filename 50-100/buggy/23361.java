@java.lang.SuppressWarnings(value = "unchecked")
public <T> org.springframework.objenesis.instantiator.ObjectInstantiator<T> getInstantiatorOf(java.lang.Class<T> clazz) {
    org.springframework.objenesis.instantiator.ObjectInstantiator<?> instantiator = this.cache.get(clazz);
    if (instantiator == null) {
        org.springframework.objenesis.instantiator.ObjectInstantiator<?> newInstantiator = this.strategy.newInstantiatorOf(clazz);
        instantiator = this.cache.putIfAbsent(clazz, newInstantiator);
        if (instantiator == null) {
            instantiator = newInstantiator;
        }
    }
    return ((org.springframework.objenesis.instantiator.ObjectInstantiator<T>) (instantiator));
}
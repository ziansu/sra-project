@java.lang.Override
public <T> toothpick.Lazy<T> getLazy(java.lang.Class<T> clazz) {
    javax.inject.Provider<T> provider = getProvider(clazz);
    return new toothpick.ProviderImpl(provider, true);
}
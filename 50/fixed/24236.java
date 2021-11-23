public void removeProvider(be.nabu.libs.converter.api.ConverterProvider<?, ?> provider) {
    synchronized(availableProviders) {
        availableProviders.remove(provider);
    }
}
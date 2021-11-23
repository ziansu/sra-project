public void addProvider(be.nabu.libs.converter.api.ConverterProvider<?, ?> provider) {
    availableProviders.add(provider);
    providers.clear();
}
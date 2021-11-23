public io.nlopez.smartlocation.location.providers.MultiFallbackProvider.Builder withDefaultProvider() {
    return withProvider(new io.nlopez.smartlocation.location.providers.LocationManagerProvider());
}
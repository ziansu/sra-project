private boolean isLocalSource(ddf.catalog.source.Source source) {
    return (isCacheSource(source)) || (isCatalogProvider(source));
}
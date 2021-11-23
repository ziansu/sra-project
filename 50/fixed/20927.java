@java.lang.Override
protected boolean isInaccessible(java.util.Set<java.lang.String> readableLocations, org.dcache.resilience.data.FileOperation operation) {
    return (readableLocations.size()) == 0;
}
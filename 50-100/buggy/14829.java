protected java.util.Set<uk.gov.gchq.gaffer.store.StoreTrait> fetchTraits() {
    final java.util.Set<uk.gov.gchq.gaffer.store.StoreTrait> proxyTraits = new java.util.HashSet<>();
    for (final java.lang.String url : config.getUrls()) {
        final java.util.Set<uk.gov.gchq.gaffer.store.StoreTrait> traits = requestor.doGet(url, ("graph/" + (uk.gov.gchq.gaffer.federated.rest.service.IFederatedGraphConfigurationService.STORE_TRAITS_PATH)), new uk.gov.gchq.gaffer.store.TypeReferenceStoreImpl.StoreTraits(), true);
        if (null != traits) {
            proxyTraits.addAll(traits);
        }
    }
    proxyTraits.remove(StoreTrait.VISIBILITY);
    return java.util.Collections.unmodifiableSet(proxyTraits);
}
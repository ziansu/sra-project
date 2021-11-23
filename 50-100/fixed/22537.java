public org.reactome.web.diagram.util.MapSet<java.lang.String, org.reactome.web.diagram.data.interactors.raw.RawInteractor> getOrCreateRawInteractorCachedResource(java.lang.String resource) {
    org.reactome.web.diagram.util.MapSet<java.lang.String, org.reactome.web.diagram.data.interactors.raw.RawInteractor> map = rawInteractorsCache.get(resource);
    if (map == null) {
        map = new org.reactome.web.diagram.util.MapSet();
        rawInteractorsCache.put(resource, map);
    }
    return map;
}
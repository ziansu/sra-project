public org.reactome.web.diagram.util.MapSet<java.lang.String, org.reactome.web.diagram.data.interactors.raw.RawInteractor> getRawInteractorsPerResource(java.lang.String resource) {
    return rawInteractorsCache.get(resource);
}
public void cache(java.lang.String resource, org.reactome.web.diagram.data.interactors.model.InteractorEntity interactor) {
    java.util.Map<java.lang.String, org.reactome.web.diagram.data.interactors.model.InteractorEntity> map = interactorsCache.get(resource);
    if (map == null) {
        map = new java.util.HashMap<>();
        interactorsCache.put(resource, map);
    }
    map.put(interactor.getAccession(), interactor);
}
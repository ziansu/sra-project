public void cache(java.lang.String resource, org.reactome.web.diagram.data.interactors.model.InteractorEntity interactor) {
    java.util.Map<java.lang.String, org.reactome.web.diagram.data.interactors.model.InteractorEntity> map = this.interactorsCache.get(resource.toLowerCase());
    if (map == null) {
        map = new java.util.HashMap<>();
        this.interactorsCache.put(resource.toLowerCase(), map);
    }
    map.put(interactor.getAccession(), interactor);
}
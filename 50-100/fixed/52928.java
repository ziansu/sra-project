public java.util.Collection<org.reactome.web.diagram.data.interactors.model.DiagramInteractor> getDiagramInteractors(java.lang.String resource, java.lang.String acc) {
    org.reactome.web.diagram.util.MapSet<java.lang.String, org.reactome.web.diagram.data.interactors.model.DiagramInteractor> cache = interactorsPerAcc.get(resource.toLowerCase());
    if (cache != null) {
        return cache.getElements(acc);
    }
    return new java.util.HashSet<>();
}
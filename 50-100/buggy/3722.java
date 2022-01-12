public java.util.Collection<org.reactome.web.diagram.data.interactors.model.InteractorLink> getDiagramInteractions(java.lang.String resource, org.reactome.web.diagram.data.layout.Node node) {
    org.reactome.web.diagram.util.MapSet<org.reactome.web.diagram.data.layout.Node, org.reactome.web.diagram.data.interactors.model.InteractorLink> cache = interactionsPerNode.get(resource);
    if (cache != null)
        return cache.getElements(node);
    
    return new java.util.HashSet<>();
}
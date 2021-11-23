public void removeInteractorLink(java.lang.String resource, org.reactome.web.diagram.data.interactors.model.InteractorLink link) {
    org.reactome.web.diagram.util.MapSet<org.reactome.web.diagram.data.layout.Node, org.reactome.web.diagram.data.interactors.model.InteractorLink> cache = interactionsPerNode.get(resource.toLowerCase());
    if (cache != null) {
        java.util.Set<org.reactome.web.diagram.data.interactors.model.InteractorLink> links = cache.getElements(link.getNodeFrom());
        if (links != null)
            links.remove(link);
        
    }
}
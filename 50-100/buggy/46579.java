public void cache(java.lang.String resource, org.reactome.web.diagram.data.layout.Node node, org.reactome.web.diagram.data.interactors.model.InteractorLink link) {
    org.reactome.web.diagram.util.MapSet<org.reactome.web.diagram.data.layout.Node, org.reactome.web.diagram.data.interactors.model.InteractorLink> cache = interactionsPerNode.get(resource.toLowerCase());
    if (cache == null) {
        cache = new org.reactome.web.diagram.util.MapSet();
        interactionsPerNode.put(resource.toLowerCase(), cache);
    }
    cache.add(node, link);
}
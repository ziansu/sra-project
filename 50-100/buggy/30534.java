public java.util.List<org.reactome.web.diagram.data.interactors.model.InteractorLink> getInteractorLinks(java.lang.String resource, org.reactome.web.diagram.data.layout.Node node) {
    org.reactome.web.diagram.util.MapSet<org.reactome.web.diagram.data.layout.Node, org.reactome.web.diagram.data.interactors.model.InteractorLink> cache = interactionsPerNode.get(resource.toLowerCase());
    if (cache != null) {
        java.util.Set<org.reactome.web.diagram.data.interactors.model.InteractorLink> set = cache.getElements(node);
        if (set != null) {
            java.util.List<org.reactome.web.diagram.data.interactors.model.InteractorLink> rtn = new java.util.ArrayList(set);
            java.util.Collections.sort(rtn);
            return rtn;
        }
    }
    return new java.util.LinkedList<>();
}
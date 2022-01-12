public java.util.Collection<org.reactome.web.diagram.data.interactors.model.DiagramInteractor> getVisibleInteractors(java.lang.String resource, uk.ac.ebi.pwp.structures.quadtree.client.Box visibleArea) {
    java.util.Set<org.reactome.web.diagram.data.interactors.model.DiagramInteractor> rtn = new java.util.HashSet<>();
    if (resource != null) {
        uk.ac.ebi.pwp.structures.quadtree.client.QuadTree<org.reactome.web.diagram.data.interactors.model.DiagramInteractor> quadTree = interactorsTreeCache.get(resource);
        if (quadTree != null)
            rtn = quadTree.getItems(visibleArea);
        
    }
    return rtn;
}
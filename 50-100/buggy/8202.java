public void addToView(java.lang.String resource, org.reactome.web.diagram.data.interactors.model.DiagramInteractor interactor) {
    uk.ac.ebi.pwp.structures.quadtree.client.QuadTree<org.reactome.web.diagram.data.interactors.model.DiagramInteractor> tree = interactorsTreeCache.get(resource.toLowerCase());
    if (tree == null) {
        tree = new uk.ac.ebi.pwp.structures.quadtree.client.QuadTree(minX, minY, maxX, maxY, org.reactome.web.diagram.data.InteractorsContent.NUMBER_OF_ELEMENTS, org.reactome.web.diagram.data.InteractorsContent.MIN_AREA);
        interactorsTreeCache.put(resource.toLowerCase(), tree);
    }
    tree.add(interactor);
}
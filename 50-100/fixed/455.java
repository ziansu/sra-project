@java.lang.Override
public void dragInteractor(org.reactome.web.diagram.data.interactors.model.InteractorEntity interactor, org.reactome.web.diagram.data.layout.Coordinate delta) {
    delta = delta.divide(context.getDiagramStatus().getFactor());
    interactorsManager.drag(interactor, delta.getX(), delta.getY());
    uk.ac.ebi.pwp.structures.quadtree.client.Box visibleArea = context.getVisibleModelArea(viewportWidth, viewportHeight);
    drawInteractors(visibleArea);
}
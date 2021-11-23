public boolean setInteractorHovered(org.reactome.web.diagram.data.interactors.model.DiagramInteractor hovered) {
    if ((mouseDown) != null)
        return false;
    
    if ((hovered != null) && (hovered instanceof org.reactome.web.diagram.data.interactors.model.InteractorEntity)) {
        hoveredInteractor = ((org.reactome.web.diagram.data.interactors.model.InteractorEntity) (hovered));
    }else {
        hoveredInteractor = null;
    }
    return true;
}
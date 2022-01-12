public boolean setInteractorHovered(org.reactome.web.diagram.data.interactors.model.DiagramInteractor hovered) {
    if ((mouseDown) != null)
        return false;
    
    if (hovered == null) {
        hoveredInteractor = null;
    }else
        if (hovered instanceof org.reactome.web.diagram.data.interactors.model.InteractorEntity) {
            hoveredInteractor = ((org.reactome.web.diagram.data.interactors.model.InteractorEntity) (hovered));
        }
    
    return true;
}
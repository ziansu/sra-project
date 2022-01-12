private org.eclipse.sirius.viewpoint.Style createAndAffectWorkspaceImageCustomized(final org.eclipse.sirius.diagram.DDiagramElement dde, final org.eclipse.sirius.diagram.description.style.WorkspaceImageDescription wid) {
    org.eclipse.sirius.viewpoint.Style newStyle = null;
    if (dde instanceof org.eclipse.sirius.diagram.DNode) {
        newStyle = createAndAffectNodeStyle(((org.eclipse.sirius.diagram.DNode) (dde)), wid);
    }else
        if (dde instanceof org.eclipse.sirius.diagram.DDiagramElementContainer) {
            newStyle = createAndAffectContainerStyle(((org.eclipse.sirius.diagram.DDiagramElementContainer) (dde)), wid);
        }
    
    newStyle.getCustomFeatures().add(DiagramPackage.Literals.WORKSPACE_IMAGE__WORKSPACE_PATH.getName());
    return newStyle;
}
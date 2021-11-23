@java.lang.Override
public boolean isEnabled() {
    org.opentravel.schemas.node.Node node = mc.getSelectedNode_NavigatorView();
    if (node == null)
        return false;
    
    if (node instanceof org.opentravel.schemas.node.ProjectNode)
        project = ((org.opentravel.schemas.node.ProjectNode) (node));
    else {
        node = node.getLibrary();
        if (node != null)
            project = ((org.opentravel.schemas.node.LibraryNode) (node)).getProject();
        
    }
    return (project) != null ? !(project.isBuiltIn()) : false;
}
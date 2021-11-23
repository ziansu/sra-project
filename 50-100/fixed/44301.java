public static java.lang.String getPortID(org.yawlfoundation.yawl.editor.ui.net.utilities.YAWLPort port) {
    if (port == null)
        return null;
    
    org.yawlfoundation.yawl.editor.ui.net.utilities.YAWLCell cell = ((org.yawlfoundation.yawl.editor.ui.net.utilities.YAWLCell) (port.getParent()));
    if (cell instanceof org.yawlfoundation.yawl.editor.ui.net.utilities.Decorator) {
        org.yawlfoundation.yawl.editor.ui.net.utilities.Decorator decorator = ((org.yawlfoundation.yawl.editor.ui.net.utilities.Decorator) (cell));
        return org.yawlfoundation.yawl.editor.ui.net.utilities.NetUtilities.getContainerID(((org.yawlfoundation.yawl.editor.ui.net.utilities.VertexContainer) (decorator.getParent())));
    }else {
        return ((org.yawlfoundation.yawl.editor.ui.net.utilities.YAWLVertex) (cell)).getID();
    }
}
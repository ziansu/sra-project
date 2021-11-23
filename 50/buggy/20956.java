public static void fillLinkingContainer(final org.csstudio.opibuilder.model.AbstractLinkingContainerModel container) throws java.lang.Exception {
    java.util.Map<org.jdom.Element, org.csstudio.opibuilder.model.ConnectionModel> connections = new java.util.HashMap<>();
    org.csstudio.opibuilder.persistence.XMLUtil.fillLinkingContainerSub(container, new java.util.ArrayList<org.eclipse.core.runtime.IPath>(), connections);
    addConnections(connections);
}
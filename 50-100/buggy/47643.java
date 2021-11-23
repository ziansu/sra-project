@java.lang.Override
public java.lang.Object execute() throws org.structr.common.error.FrameworkException {
    java.util.List<org.structr.core.node.NodeAttribute> attrs = new java.util.LinkedList<org.structr.core.node.NodeAttribute>();
    attrs.add(new org.structr.core.node.NodeAttribute("type", "Resource"));
    attrs.add(new org.structr.core.node.NodeAttribute("name", name));
    org.structr.core.entity.AbstractNode page1 = org.structr.web.Importer.findOrCreateNode(attrs, "/");
    org.structr.web.Importer.createChildNodes(page, page1, page1.getStringProperty(AbstractNode.Key.uuid), baseUrl);
    return null;
}
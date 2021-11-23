private void emitContainer(final org.opendaylight.yangtools.yang.model.api.ContainerSchemaNode child) {
    writer.startContainerNode(child.getQName());
    emitConstraints(child.getConstraints());
    emitMustNodes(child.getConstraints().getMustConstraints());
    emitPresenceNode(child.isPresenceContainer());
    emitConfigNode(child.isConfiguration());
    emitDocumentedNode(child);
    emitDataNodeContainer(child);
    emitUnknownStatementNodes(child.getUnknownSchemaNodes());
    writer.endNode();
}
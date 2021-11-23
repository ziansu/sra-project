public void detach(final org.arastreju.sge.model.nodes.ResourceNode node) {
    workingContext().detach(node.getQualifiedName());
    org.arastreju.bindings.neo4j.impl.AssocKeeperAccess.setAssociationKeeper(node, new org.arastreju.sge.model.associations.DetachedAssociationKeeper(node.getAssociations()));
}
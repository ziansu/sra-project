@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
protected java.util.List<org.alfresco.repo.domain.node.ChildAssocEntity> selectParentAssocs(java.lang.Long childNodeId) {
    org.alfresco.repo.domain.node.ChildAssocEntity assoc = new org.alfresco.repo.domain.node.ChildAssocEntity();
    org.alfresco.repo.domain.node.NodeEntity childNode = new org.alfresco.repo.domain.node.NodeEntity();
    childNode.setId(childNodeId);
    assoc.setChildNode(childNode);
    template.clearCache();
    return ((java.util.List<org.alfresco.repo.domain.node.ChildAssocEntity>) (template.selectList(org.alfresco.repo.domain.node.ibatis.NodeDAOImpl.SELECT_PARENT_ASSOCS_OF_CHILD, assoc)));
}
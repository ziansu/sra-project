public org.talend.core.model.repository.ERepositoryObjectType getRepositoryType(org.talend.repository.model.IRepositoryNode node) {
    org.talend.repository.model.IRepositoryNode testNode = node;
    while (testNode != null) {
        org.talend.core.model.repository.ERepositoryObjectType repObjType = testNode.getContentType();
        if (repObjType != null) {
            return repObjType;
        }
        testNode = testNode.getParent();
        if (testNode instanceof org.talend.core.repository.model.ProjectRepositoryNode) {
            break;
        }
    } 
    return null;
}
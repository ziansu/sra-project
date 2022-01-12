@java.lang.Override
public org.lenzi.fstore.repository.model.DbNode addChildNode(org.lenzi.fstore.repository.model.DbNode parentNode, org.lenzi.fstore.repository.model.DbNode newNode) throws org.lenzi.fstore.repository.exception.DatabaseException {
    if ((parentNode == null) || (newNode == null)) {
        throw new org.lenzi.fstore.repository.exception.DatabaseException("Cannot add new node. Parent node and/or new node objects are null.");
    }
    if ((parentNode.getNodeId()) == null) {
        throw new org.lenzi.fstore.repository.exception.DatabaseException("Cannot add new node. Parent node ID is null. This information is needed.");
    }
    return addNode(parentNode.getNodeId(), newNode);
}
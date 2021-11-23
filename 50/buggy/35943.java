@java.lang.Override
public org.lenzi.fstore.repository.model.DbNode addRootNode(org.lenzi.fstore.repository.model.DbNode newNode) throws org.lenzi.fstore.repository.exception.DatabaseException {
    if (newNode == null) {
        throw new org.lenzi.fstore.repository.exception.DatabaseException("Cannot add new node. Node object is null.");
    }
    logger.info("Add root node");
    return addNode(0L, newNode);
}
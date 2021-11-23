@java.lang.Override
public org.neo4j.kernel.impl.api.store.RelationshipIterator nodeGetRelationships(long nodeId, org.neo4j.graphdb.Direction direction) throws org.neo4j.kernel.api.exceptions.EntityNotFoundException {
    statement.assertOpen();
    if (statement.txState().nodeIsDeletedInThisTx(nodeId)) {
        return org.neo4j.kernel.impl.api.store.RelationshipIterator.EMPTY;
    }
    try (org.neo4j.cursor.Cursor<org.neo4j.kernel.api.cursor.NodeItem> node = dataRead().nodeCursorById(statement, nodeId)) {
        return node.get().getRelationships(direction);
    }
}
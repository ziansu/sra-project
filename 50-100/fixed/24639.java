@java.lang.Override
public org.neo4j.kernel.impl.api.store.RelationshipIterator nodeGetRelationships(long nodeId, org.neo4j.graphdb.Direction direction) throws org.neo4j.kernel.api.exceptions.EntityNotFoundException {
    statement.assertOpen();
    try (org.neo4j.cursor.Cursor<org.neo4j.kernel.api.cursor.NodeItem> node = dataRead().nodeCursorById(statement, nodeId)) {
        return node.get().getRelationships(direction);
    }
}
private org.neo4j.graphdb.Relationship relationship(long relId) {
    org.neo4j.kernel.impl.core.RelationshipProxy relationship = new org.neo4j.kernel.impl.core.RelationshipProxy(relationshipActions, relId);
    if (!(state.relationshipVisit(relId, relationship))) {
        org.neo4j.kernel.impl.core.RelationshipProxy cached = relationshipsReadFromStore.get(relId);
        if (cached != null) {
            return relationship;
        }
        try {
            store.relationshipVisit(relId, relationship);
            relationshipsReadFromStore.put(relId, relationship);
        } catch (org.neo4j.kernel.api.exceptions.EntityNotFoundException e) {
            throw new java.lang.IllegalStateException("Getting deleted relationship data should have been covered by the tx state");
        }
    }
    return relationship;
}
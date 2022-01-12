public synchronized <T extends com.tinkerpop.blueprints.Element> com.tinkerpop.blueprints.Index<T> createIndex(final java.lang.String indexName, final java.lang.Class<T> indexClass, final com.tinkerpop.blueprints.Parameter... indexParameters) {
    this.autoStartTransaction();
    if ((this.rawGraph.index().existsForNodes(indexName)) || (this.rawGraph.index().existsForRelationships(indexName))) {
        throw com.tinkerpop.blueprints.util.ExceptionFactory.indexAlreadyExists(indexName);
    }
    return new com.tinkerpop.blueprints.impls.neo4j2.Neo4j2Index(indexName, indexClass, this, indexParameters);
}
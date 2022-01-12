@org.apache.atlas.GraphTransaction
com.tinkerpop.blueprints.Vertex getTableEntityVertex() {
    com.thinkaurelius.titan.core.TitanGraph graph = graphProvider.get();
    com.tinkerpop.blueprints.GraphQuery query = graph.query().has(Constants.ENTITY_TYPE_PROPERTY_KEY, Compare.EQUAL, org.apache.atlas.repository.graph.GraphBackedMetadataRepositoryTest.TABLE_TYPE);
    java.util.Iterator<com.tinkerpop.blueprints.Vertex> results = query.vertices().iterator();
    com.tinkerpop.blueprints.Vertex tableVertex = (results.hasNext()) ? results.next() : null;
    if (tableVertex == null) {
        org.testng.Assert.fail();
    }
    return tableVertex;
}
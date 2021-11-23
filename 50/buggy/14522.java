public static org.neo4j.graphdb.index.IndexHits<org.neo4j.graphdb.Relationship> context(org.neo4j.graphdb.Node node) {
    return new org.animotron.graph.index.ContextHits(org.animotron.graph.index.Order.INDEX.query(org.animotron.graph.index.Order.NAME, org.animotron.graph.index.Order.sort(org.animotron.graph.index.Order.NAME), node, null));
}
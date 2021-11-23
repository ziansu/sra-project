@java.lang.Override
public boolean updateNode(java.lang.String dbid, edu.berkeley.cs.Node node) throws java.lang.Exception {
    com.thinkaurelius.titan.core.TitanTransaction tx = edu.berkeley.cs.LinkStoreTitan.g.buildTransaction().start();
    com.tinkerpop.blueprints.Vertex v;
    try {
        v = tx.getVertices("iid", node.id).iterator().next();
    } catch (java.util.NoSuchElementException e) {
        return false;
    }
    v.setProperty("node-data", new java.lang.String(node.data));
    tx.commit();
    return true;
}
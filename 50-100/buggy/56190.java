@java.lang.Override
public java.lang.Object call(com.tinkerpop.blueprints.impls.orient.OrientBaseGraph graph) {
    for (com.orientechnologies.orient.core.id.ORecordId rid : rids) {
        final com.tinkerpop.blueprints.impls.orient.OrientEdge e = graph.getEdge(rid);
        if (e != null) {
            e.remove();
            removed = 1;
        }
    }
    return null;
}
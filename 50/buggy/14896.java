@java.lang.Override
public boolean addEdge(model.Edge e, model.Node n1, model.Node n2, edu.uci.ics.jung.graph.util.EdgeType arg3) {
    return (n1.addEdgeOut(e)) && (n2.addEdgeIn(e));
}
@java.lang.Override
public boolean removeEdge(csula.cs4660.graphs.Edge x) {
    if ((!(nodes.contains(x.getFrom()))) || (!(nodes.contains(x.getTo())))) {
        java.lang.System.out.println("Error: fromNode or toNode not exists");
    }else {
        edges.remove(x);
    }
    return false;
}
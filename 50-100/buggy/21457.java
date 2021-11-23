@java.lang.Override
public int weigh(org.neo4j.graphdb.Relationship rel) {
    org.neo4j.graphdb.Node startNode = rel.getStartNode();
    org.neo4j.graphdb.Node endNode = rel.getEndNode();
    java.lang.String startName = startNode.getProperty("name").toString();
    java.lang.String endName = endNode.getProperty("name").toString();
    boolean isInnerEdge = startName.equals(endName.concat("'"));
    if (isInnerEdge) {
        return innerWeight;
    }
    return outterWeight;
}
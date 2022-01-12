public void removeByOBJ_ID(java.lang.Integer id) {
    java.lang.String cypher = "MATCH (n) WHERE n.OBJECT_ID = ";
    cypher = cypher.concat(((id.toString()) + " DETACH DELETE n"));
    executeQuery(cypher);
}
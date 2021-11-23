public static void removeByOBJ_ID(java.lang.Integer id) {
    java.lang.String cypher = "MATCH (n) WHERE n.OBJECT_ID = ";
    cypher.concat(((id.toString()) + " DETACH DELETE n"));
    src.DBController.executeQuery(cypher);
}
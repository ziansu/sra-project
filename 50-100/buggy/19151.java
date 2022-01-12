@java.lang.Override
public void collectResult(org.neo4j.cypher.javacompat.ExecutionResult result) {
    java.lang.System.out.println(result.toString());
    for (java.util.Map<java.lang.String, java.lang.Object> row : result) {
        long nodeid = ((long) (row.get("nodeid")));
        long triangleCount = ((long) (row.get("triangleCount")));
        this.triangleMap.put(nodeid, triangleCount);
    }
}
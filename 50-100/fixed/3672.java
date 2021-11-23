public static int getMaxPid(org.neo4j.graphdb.GraphDatabaseService db) {
    org.neo4j.graphdb.Result result = null;
    java.lang.String queryString = "match (n) return max(n.P_ID) as mpid ";
    result = db.execute(queryString);
    java.util.Iterator<java.lang.Integer> n_column = result.columnAs("mpid");
    if (n_column.hasNext()) {
        java.lang.Integer i = n_column.next();
        if (i != null)
            return i.intValue();
        
    }
    return -1;
}
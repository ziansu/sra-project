public void destroyManagedConnection(com.netoprise.neo4j.Neo4jManagedConnection connection) {
    (connectionsCreated)--;
    if ((connectionsCreated) <= 0) {
    }
}
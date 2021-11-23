public static void main(java.lang.String[] args) {
    com.neo4j.connection.NeoConnection connection = com.neo4j.connection.NeoConnection.getNeoConnection();
    connection.neoConnect();
    connection.logout();
}
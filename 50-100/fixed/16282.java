protected void connectToGateway(java.lang.String username, java.lang.String password, java.lang.String hostname, int port) throws java.io.IOException {
    connection = new com.challenge.cube.CubeConnection(hostname, port);
    try {
        connection.connect();
    } catch (java.io.IOException e) {
        connection = null;
        throw e;
    }
    java.lang.String cudeId = username;
    connection.auth(cudeId, password);
}
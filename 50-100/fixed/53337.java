public static void main(java.lang.String[] args) throws java.lang.Exception {
    com.ele.me.CommonClient client = new com.ele.me.CommonClient("localhost", 5001, 1);
    try {
        java.lang.String command = "DELETE FROM simple";
        client.commandServer(command);
        command = "INSERT INTO simple VALUES (1, 9)";
        client.commandServer(command);
        command = "INSERT INTO simple VALUES (2, 8)";
        client.commandServer(command);
        java.lang.String query = "SELECT * FROM simple";
        client.queryServer(query);
    } finally {
        client.shutdown();
    }
}
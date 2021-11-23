public void sendQuery(java.lang.String query) {
    try {
        java.sql.Statement stmt = conn.createStatement();
        java.lang.System.out.println(("Sending Query: " + query));
        stmt.executeUpdate(query);
        stmt.close();
    } catch (java.lang.Exception e) {
        java.lang.System.err.println("sendQuery - Got an exception: ");
        java.lang.System.err.println(e.getMessage());
    }
}
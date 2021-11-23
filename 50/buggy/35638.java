public void disconnect() {
    if ((con) != null) {
        try {
            con.close();
        } catch (java.sql.SQLException ex) {
            java.lang.System.out.println("Can't close connection");
        }
    }
}
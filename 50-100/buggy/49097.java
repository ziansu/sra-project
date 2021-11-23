protected void after() {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String deleteStylistsQuery = "DELETE FROM stylists *;";
        java.lang.String deleteClientsQuery = "DELETE FROM clients *;";
        con.createQuery(deleteStylistsQuery).executeUpdate();
        con.createQuery(deleteClientsQuery).executeUpdate();
    }
}
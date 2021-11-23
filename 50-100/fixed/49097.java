protected void after() {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String deleteClientsQuery = "DELETE FROM clients *;";
        java.lang.String deleteStylistsQuery = "DELETE FROM stylists *;";
        con.createQuery(deleteClientsQuery).executeUpdate();
        con.createQuery(deleteStylistsQuery).executeUpdate();
    }
}
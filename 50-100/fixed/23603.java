public java.util.List<Client> getClients() {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sql = "SELECT * FROM clients WHERE stylistid = :id;";
        java.util.List<Client> clients = con.createQuery(sql).addParameter("id", id).executeAndFetch(Client.class);
        return clients;
    }
}
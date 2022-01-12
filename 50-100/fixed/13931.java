public void save() {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sql = "INSERT INTO stylists(name) VALUES (:name)";
        this.id = ((int) (con.createQuery(sql, true).addParameter("name", name).executeUpdate().getKey()));
    }
}
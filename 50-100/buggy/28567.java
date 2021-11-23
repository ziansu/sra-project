public void save() {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sql = "INSERT INTO stylists (name, details) VALUES (:name, :details);";
        this.id = ((int) (con.createQuery(sql, true).addParameter("name", this.name).addParameter("details", this.details).executeUpdate()));
        getKey();
    }
}
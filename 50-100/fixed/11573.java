public void save() {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sql = "INSERT INTO persons (name, email) VALUES (:name, :email)";
        this.id = ((int) (con.createQuery(sql, true).addParameter("name", this.name).addParameter("email", this.email).executeUpdate().getKey()));
    }
}
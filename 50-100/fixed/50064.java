public void update(java.lang.String info) {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sql = "UPDATE clients SET info = :info WHERE id=:id";
        con.createQuery(sql).addParameter("info", info).addParameter("id", id).executeUpdate();
    }
}
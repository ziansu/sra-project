public void update(java.lang.String name) {
    this.mName = name;
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sql = "UPDATE stylists SET name = :name WHERE id = :id";
        con.createQuery(sql).addParameter("name", mName).addParameter("id", mId).executeUpdate();
    }
}
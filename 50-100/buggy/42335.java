public void editStylist(java.lang.String newName) {
    this.name = newName;
    java.lang.String sql = "UPDATE stylists SET name = :newname WHERE id = :id";
    try (Connection con = DB.sql2o.open()) {
        con.createQuery(sql).addParameter("newname", newName).addParameter("id", this.id).executeUpdate();
    }
}
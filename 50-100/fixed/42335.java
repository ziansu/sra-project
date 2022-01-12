public void editStylist(java.lang.String newName) {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sql = "UPDATE stylists SET name = :newname WHERE id = :id";
        con.createQuery(sql).addParameter("newname", newName).addParameter("id", this.id).executeUpdate();
    }
}
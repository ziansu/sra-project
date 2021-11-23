public void update(java.lang.String nameOfWeapon) {
    this.nameOfWeapon = nameOfWeapon;
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sql = "UPDATE weapons SET nameofweapon = :nameofweapon WHERE id = :id";
        con.createQuery(sql).addParameter("nameofweapon", nameOfWeapon).addParameter("id", id).executeUpdate();
    }
}
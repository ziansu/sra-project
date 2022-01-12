public int count() {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sql = "SELECT count(*) FROM doctors where specialty_id=:id";
        return ((int) (con.createQuery(sql).addParameter("id", id).executeScalar(java.lang.Integer.class)));
    }
}
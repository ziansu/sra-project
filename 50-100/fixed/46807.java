public void update(java.lang.String location, java.lang.String ranger) {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sql = "UPDATE sightings SET location = :location , ranger = :ranger WHERE id=:id";
        con.createQuery(sql).addParameter("location", location).addParameter("ranger", ranger).addParameter("id", id).executeUpdate();
    }
}
public void update(java.lang.String content, java.lang.String animalId) {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sql = "UPDATE sightings SET animalId = :animalId, ranger = :ranger, location = :location WHERE id = :id";
        con.createQuery(sql).addParameter("animalId", animalId).addParameter("ranger", ranger).addParameter("location", location).addParameter("id", this.id).executeUpdate();
    }
}
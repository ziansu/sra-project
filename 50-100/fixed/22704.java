public void update(int animalId, java.lang.String location, java.lang.String ranger) {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sql = "UPDATE sightings SET animalId = :animalId, ranger = :ranger, location = :location WHERE id = :id";
        con.createQuery(sql).addParameter("animalId", animalId).addParameter("location", location).addParameter("ranger", ranger).addParameter("id", this.id).executeUpdate();
    }
}
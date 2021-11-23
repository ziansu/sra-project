public void save() {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sql = "INSERT INTO sightings (animal_id, location, ranger_name) VALUES (:animal_id, :location, :ranger_name);";
        this.id = ((int) (con.createQuery(sql, true).addParameter("animal_id", this.animal_id).addParameter("location", this.location).addParameter("ranger_name", this.ranger_name).throwOnMappingFailure(false).executeUpdate().getKey()));
    }
}
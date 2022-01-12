@java.lang.Override
public void save() {
    java.lang.String sql = "INSERT INTO sightings (animal_id, location, ranger_name, timestamp) VALUES (:animal_id, :location, :ranger_name, now());";
    try (Connection con = DB.sql2o.open()) {
        this.id = ((int) (con.createQuery(sql, true).addParameter("animal_id", this.animal_id).addParameter("location", this.location).addParameter("ranger_name", this.ranger_name).executeUpdate().getKey()));
    }
}
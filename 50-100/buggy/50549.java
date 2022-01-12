public void removePerson(Person person) {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sql = "DELETE FROM weapons_person WHERE weapon_id = :weapon_id AND person_id = :person_id";
        con.createQuery(sql).addParameter("weapon_id", id).addParameter("person_id", Person.getId()).executeUpdate();
    }
}
public void save() {
    try (Connection con = DB.sql2o.open()) {
        java.lang.String sqlCommand = "INSERT INTO specialties (specialtyname) VALUES (:specialtyname);";
        this.specialtyid = ((int) (con.createQuery(sqlCommand, true).addParameter("specialtyname", specialtyName).executeUpdate().getKey()));
    }
}
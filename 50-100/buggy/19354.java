public void setData() throws java.sql.SQLException {
    this.medical_card = resultSet.getString("medical_card");
    this.surname = resultSet.getString("Surname");
    this.id = java.lang.Integer.valueOf(resultSet.getString("ID"));
    this.name = resultSet.getString("Name");
    this.fathername = resultSet.getString("Fathername");
}
public void changeDateOfData(java.lang.Integer data_id, java.lang.Integer date) throws java.sql.SQLException {
    java.lang.String update = ((("UPDATE data SET date = " + date) + " WHERE data_id = ") + data_id) + ";";
    java.sql.Statement statement = null;
    statement = con.createStatement();
    statement.executeUpdate(update);
}
public void changeDateOfData(java.lang.Integer data_id, java.lang.Integer date, GUI.UpdateTableFrame frame) {
    java.lang.String update = ((("UPDATE data SET date = " + date) + " WHERE data_id = ") + data_id) + ";";
    java.sql.Statement statement = null;
    try {
        statement = con.createStatement();
        statement.executeUpdate(update);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        GUI.ErrorFrame error = new GUI.ErrorFrame(frame, "Invalid Date");
        error.setVisible(true);
    }
}
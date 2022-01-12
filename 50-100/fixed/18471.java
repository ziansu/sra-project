public void setStudentNames(int studentUserID) {
    try {
        java.lang.String query = "SELECT first_name, last_name FROM users WHERE user_id = " + studentUserID;
        stmt = dbConnection.createStatement();
        java.sql.ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            studentName = ((rs.getString("first_name")) + " ") + (rs.getString("last_name"));
        } 
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
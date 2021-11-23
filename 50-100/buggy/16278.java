public void fillComboBox(javafx.collections.ObservableList option) throws java.sql.SQLException {
    java.sql.Connection conn = null;
    try {
        java.lang.String query = "SELECT date FROM schedule ORDER BY date DESC";
        conn = establishConnection();
        java.sql.PreparedStatement prepStmt = conn.prepareStatement(query);
        java.sql.ResultSet rs = prepStmt.executeQuery();
        while (rs.next()) {
            option.add(rs.getDate("date"));
        } 
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("fill combox error: " + e));
    }
    conn.close();
}
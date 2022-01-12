public java.lang.String getUserName(java.lang.String email) {
    java.lang.String Name = "Not Set";
    try {
        java.lang.String queryString = ("SELECT firstName FROM user" + " WHERE email = ") + email;
        java.sql.Statement st = connection.createStatement();
        java.sql.ResultSet rs = st.executeQuery(queryString);
        if (rs.next()) {
            Name = rs.getString("firstName");
            return Name;
        }
    } catch (java.sql.SQLException ex) {
        java.lang.System.out.println(("Error: " + (ex.getMessage())));
    }
    return null;
}
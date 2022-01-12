public java.lang.String getUserName(java.lang.String email) {
    java.lang.String name;
    try {
        java.lang.String queryString = ("SELECT firstName FROM user" + " WHERE email = ") + email;
        java.sql.Statement st = connection.createStatement();
        java.sql.ResultSet rs = st.executeQuery(queryString);
        if (rs.next()) {
            name = rs.getString("firstName");
            return name;
        }
    } catch (java.sql.SQLException ex) {
        java.lang.System.out.println(("Error: " + (ex.getMessage())));
    }
    return null;
}
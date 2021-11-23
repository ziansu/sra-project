private java.sql.ResultSet makeStatement(java.lang.String statement) {
    try {
        java.sql.Statement st = connection.createStatement();
        java.sql.ResultSet result = st.executeQuery(statement);
        while (result.next()) {
            java.lang.System.out.println(("Got employee: " + (result.getString("name"))));
        } 
        result.close();
        st.close();
        connection.close();
        return result;
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return null;
}
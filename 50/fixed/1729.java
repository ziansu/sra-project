public void execute(java.lang.String query) throws java.sql.SQLException {
    java.sql.Statement st = connection.createStatement();
    st.execute(query);
}
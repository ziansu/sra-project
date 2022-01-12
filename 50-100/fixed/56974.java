java.lang.String getCurrentCountry(java.sql.Connection conn, Game.Player person) throws java.sql.SQLException {
    java.sql.PreparedStatement st = conn.prepareStatement("SELECT locationcountry FROM persons WHERE personnummer = ? AND country = ?");
    st.setString(1, person.personnummer);
    st.setString(2, person.country);
    java.sql.ResultSet rs = st.executeQuery();
    java.lang.String string = null;
    if (rs.next())
        string = rs.getString(1);
    
    rs.close();
    st.close();
    return string;
}
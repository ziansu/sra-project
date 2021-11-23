public java.sql.ResultSet query(java.lang.String sql, java.lang.Object... object) {
    java.sql.ResultSet set = null;
    try {
        java.sql.PreparedStatement st = getConnection().prepareStatement(sql);
        for (int i = 0; i < (object.length); i++) {
            st.setObject((i + 1), object[i]);
        }
        set = st.executeQuery();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return set;
}
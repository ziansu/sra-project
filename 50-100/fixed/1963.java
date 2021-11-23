public static void deleteAll(int uid) {
    java.lang.String insert = "DELETE FROM Vacancy WHERE c_id = ? AND archive = 0";
    try {
        java.sql.Connection con = Utilities.DBService.connect();
        java.sql.PreparedStatement st = con.prepareStatement(insert);
        st.setInt(1, uid);
        st.execute();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}
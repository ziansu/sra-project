public void closeConn() {
    try {
        st.close();
        conn.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}
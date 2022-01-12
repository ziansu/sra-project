public void create_tag(java.lang.Integer photo_id, java.lang.String tag) {
    try {
        java.sql.PreparedStatement st = null;
        st = conn.prepareStatement("INSERT INTO photo_tags (photo_id, tag) VALUES (?, ?)");
        st.setObject(1, photo_id);
        st.setObject(2, tag);
        int rc = st.executeUpdate();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}
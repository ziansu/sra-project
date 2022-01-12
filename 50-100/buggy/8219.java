@java.lang.SuppressWarnings(value = "unused")
private void storeDB(java.sql.PreparedStatement ps, java.lang.String sample_id, int chr, int pos_index, byte[] pos_array, byte[] base_array) throws java.sql.SQLException {
    ps.setQueryTimeout(genome.ManageDB.SQLITE_TIMEOUT_SEC);
    ps.setInt(1, chr);
    ps.setInt(2, pos_index);
    ps.setString(3, sample_id);
    ps.setBytes(4, pos_array);
    ps.setBytes(5, base_array);
    ps.executeUpdate();
}
@java.lang.SuppressWarnings(value = "unused")
private void storeDB(java.sql.PreparedStatement ps, java.lang.String sample_id, int chr, int pos_index, byte[] pos_array, byte[] base_array) throws java.sql.SQLException {
    ps.setQueryTimeout(genome.ManageDB.SQLITE_TIMEOUT_SEC);
    ps.setInt(1, pos_index);
    ps.setString(2, sample_id);
    ps.setBytes(3, pos_array);
    ps.setBytes(4, base_array);
    ps.executeUpdate();
}
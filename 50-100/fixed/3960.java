public void iHave(java.lang.String table, int id, java.lang.String tag) throws java.sql.SQLException {
    if ((tag.isEmpty()) || (tag == null)) {
        query = (("UPDATE " + table) + " SET ihave=1 WHERE id=") + id;
    }else {
        query = (((("UPDATE " + table) + " SET ihave=1, tag='") + tag) + "' WHERE id=") + id;
    }
    stmt.execute(query);
}
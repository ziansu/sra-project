protected void close() throws de.jottyfan.postdbm.PostDBMException {
    try {
        connection.close();
    } catch (java.sql.SQLException e) {
        throw new de.jottyfan.postdbm.PostDBMException(e);
    }
}
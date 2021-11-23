public void rollback() throws de.jottyfan.postdbm.PostDBMException {
    try {
        connection.rollback();
        connection.close();
    } catch (java.sql.SQLException e) {
        throw new de.jottyfan.postdbm.PostDBMException(e);
    }
}
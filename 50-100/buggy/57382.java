public static int delete(java.lang.String query) {
    int rows = 0;
    try {
        cs4050.bookstore.persistlayer.DbAccessImpl.con = cs4050.bookstore.persistlayer.DbAccessImpl.connect();
        cs4050.bookstore.persistlayer.DbAccessImpl.pstmt = cs4050.bookstore.persistlayer.DbAccessImpl.con.prepareStatement(query);
        rows = cs4050.bookstore.persistlayer.DbAccessImpl.pstmt.executeUpdate();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    } finally {
        cs4050.bookstore.persistlayer.DbAccessImpl.disconnect();
    }
    return rows;
}
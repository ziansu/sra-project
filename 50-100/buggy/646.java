@java.lang.Override
public boolean closeConnection() {
    if ((imdb.database.dao.MovieDAOImpl.conn) != null) {
        try {
            imdb.database.dao.MovieDAOImpl.conn.close();
        } catch (java.sql.SQLException e) {
            java.lang.System.out.println(("Exception while closing the connection : " + (e.getMessage())));
            return false;
        }
    }
    return true;
}
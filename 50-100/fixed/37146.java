@java.lang.Override
public void disconnectFromDatabase() {
    if (connectedToDatabase) {
        try {
            if ((resultSet) != null)
                resultSet.close();
            
            if ((statement) != null)
                statement.close();
            
            if ((connection) != null)
                connection.close();
            
        } catch (java.sql.SQLException sqlException) {
            sqlException.printStackTrace();
        } finally {
            connectedToDatabase = false;
        }
    }
}
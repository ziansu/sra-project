@java.lang.Override
public void disconnectFromDatabase() {
    if (connectedToDatabase) {
        try {
            if ((resultSet) != null)
                resultSet.close();
            
            statement.close();
            connection.close();
        } catch (java.sql.SQLException sqlException) {
            sqlException.printStackTrace();
        } finally {
            connectedToDatabase = false;
        }
    }
}
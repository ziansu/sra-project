public void close() {
    if ((resultSet) != null)
        try {
            resultSet.close();
        } catch (java.sql.SQLException e) {
            throw new com.jaspersoft.tamanoir.ConnectionException(e);
        }
    
    if ((statement) != null)
        try {
            statement.close();
        } catch (java.sql.SQLException e) {
            throw new com.jaspersoft.tamanoir.ConnectionException(e);
        }
    
    if ((connection) != null)
        try {
            connection.close();
        } catch (java.sql.SQLException e) {
            throw new com.jaspersoft.tamanoir.ConnectionException(e);
        }
    
}
public void close() {
    if ((resultSet) != null)
        try {
            resultSet.close();
            if ((statement) != null)
                statement.close();
            
            connection.close();
        } catch (java.sql.SQLException e) {
            throw new com.jaspersoft.tamanoir.ConnectionException(e);
        }
    
}
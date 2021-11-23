private void close() {
    try {
        if ((resultSet) != null) {
            resultSet.close();
        }
        if ((preparedStatement) != null) {
            preparedStatement.close();
        }
        if ((connect) != null) {
            connect.close();
        }
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println(e);
    }
}
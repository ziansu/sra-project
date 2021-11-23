private void close() {
    try {
        if ((this.resultSet) != null) {
            this.resultSet.close();
        }
        if ((this.preparedStatement) != null) {
            this.preparedStatement.close();
        }
        if ((this.connect) != null) {
            this.connect.close();
        }
    } catch (final java.sql.SQLException e) {
        java.lang.System.out.println(e);
    }
}
private void deleteTable(org.eclipse.dirigible.ide.db.viewer.views.TableDefinition tableDefinition, org.eclipse.dirigible.ide.db.viewer.views.IDatabaseConnectionFactory connectionFactory) throws java.sql.SQLException {
    java.sql.Connection connection = connectionFactory.getDatabaseConnection();
    try {
        java.sql.Statement createStatement = connection.createStatement();
        try {
            java.lang.String name = tableDefinition.getFqn();
            createStatement.execute(((org.eclipse.dirigible.ide.db.viewer.views.actions.DeleteTableAction.DROP_TABLE) + name));
        } finally {
            if (createStatement != null) {
                createStatement.close();
            }
        }
    } finally {
        if (connection != null) {
            connection.close();
        }
    }
}
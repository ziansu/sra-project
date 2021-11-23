public boolean deleteDB() {
    boolean status = true;
    for (models.TableDefinition tableDefinition : this.taskSet.getTableDefinitions()) {
        try {
            java.lang.String statement = ("DROP TABLE IF EXISTS " + (tableDefinition.getTableName())) + ";";
            this.statement.execute(statement);
        } catch (java.sql.SQLException e) {
            play.Logger.error(("DBConnection.delete: " + (e.getMessage())));
            status = false;
        }
    }
    return status;
}
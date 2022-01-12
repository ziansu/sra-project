private boolean checkTask() throws de.tu_bs.cs.ifis.sqlgame.exception.MySQLAlchemistException {
    java.lang.String selectStatement = "SELECT * FROM Task WHERE name = ?";
    java.lang.String[] variables = new java.lang.String[1];
    variables[0] = this.name;
    java.util.List result = this.fixDbConn.executeSQLSelectPreparedStatement(this.conf.getString("auth.user"), this.conf.getString("auth.pass"), selectStatement, variables);
    return !(result == null);
}
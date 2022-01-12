public void execute(java.lang.String resourceName) {
    try {
        by.dbmanual.utils.ScriptRunner runner = new by.dbmanual.utils.ScriptRunner(connection, true, true);
        runner.runScript(new java.io.InputStreamReader(by.dbmanual.utils.DataBase.class.getResourceAsStream(resourceName)));
    } catch (java.sql.SQLException | java.io.IOException e) {
        e.printStackTrace();
    }
}
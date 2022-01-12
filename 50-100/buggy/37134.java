@java.lang.Override
public void CreateIndexes() {
    CheckConnection();
    java.lang.String[] tableNames = GetFileList();
    for (java.lang.String tableName : tableNames) {
        tableName = validateFname(tableName);
        com.gmt2001.Console.out.println(("    Indexing Table: " + tableName));
        try (java.sql.PreparedStatement statement = connection.prepareStatement((((("CREATE INDEX IF NOT EXISTS " + tableName) + "_idx on phantombot_") + tableName) + " (variable);"))) {
            statement.execute();
        } catch (java.sql.SQLException ex) {
            com.gmt2001.Console.err.printStackTrace(ex);
        }
    }
}
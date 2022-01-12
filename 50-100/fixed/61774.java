@notebook.dao.AfterClass
public static void dropTestDB() throws java.io.IOException, java.sql.SQLException, notebook.exception.PropFileLoadException, notebook.exception.ResourceNotFoundException {
    java.sql.Connection connection = java.sql.DriverManager.getConnection(notebook.dao.HibernateRecordDAOTest.url);
    com.ibatis.common.jdbc.ScriptRunner scriptRunner = new com.ibatis.common.jdbc.ScriptRunner(connection, false, true);
    java.io.Reader reader = new java.io.FileReader(((java.lang.System.getProperty("user.dir")) + "/src/test/resources/dropDB.sql"));
    scriptRunner.runScript(reader);
    connection.close();
}
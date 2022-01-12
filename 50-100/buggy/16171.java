@org.junit.Before
public void initialize() throws java.sql.SQLException {
    java.lang.String sep = java.io.File.separator;
    java.lang.System.setProperty("SOFTCLICKER_HOME", ((((((java.lang.System.getProperty("user.dir")) + sep) + "target") + sep) + "classes") + sep));
    org.softclicker.server.database.EmbeddedServer.startDB();
    scopingDataSource = new org.softclicker.server.dao.ScopingDataSource(new org.softclicker.server.config.ServerConfigManager());
    org.softclicker.server.starup.DatabaseCreator creator = new org.softclicker.server.starup.DatabaseCreator(scopingDataSource);
    creator.createDbStructureIfNotExists("SELECT * FROM USER");
}
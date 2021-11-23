@javax.annotation.PostConstruct
public void construct() throws java.sql.SQLException {
    dbui = org.h2.tools.Server.createWebServer().start();
}
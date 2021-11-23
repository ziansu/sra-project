@java.lang.Override
public void contextInitialized(javax.servlet.ServletContextEvent contextEvent) {
    javax.servlet.ServletContext context = contextEvent.getServletContext();
    java.lang.System.out.println("Context Initialized!");
    com.hivesys.core.db.DBConnectionPool dbconn = com.hivesys.core.db.DBConnectionPool.getInstance();
    com.hivesys.core.es.ElasticSearchContext es = com.hivesys.core.es.ElasticSearchContext.getInstance();
    try {
        es.initClient("localhost", 9300);
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println("Cannot Connect to elastic search Node. Exiting!!!");
    }
    com.hivesys.config.Config.getInstance().loadConfig();
}
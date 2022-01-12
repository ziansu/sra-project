@java.lang.Override
public void contextInitialized(javax.servlet.ServletContextEvent event) {
    javax.servlet.ServletContext context = event.getServletContext();
    java.lang.String log4jConfigFile = context.getInitParameter("log4j-config-location");
    java.lang.String fullPath = context.getRealPath((("" + (java.io.File.separator)) + log4jConfigFile));
    org.apache.log4j.PropertyConfigurator.configure(fullPath);
}
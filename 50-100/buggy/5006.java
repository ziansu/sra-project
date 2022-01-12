private void initLog4J(javax.servlet.ServletContextEvent event) {
    java.lang.String logfilename = event.getServletContext().getInitParameter("logfile");
    java.lang.String pref = "";
    pref = event.getServletContext().getRealPath("/");
    org.apache.log4j.PropertyConfigurator.configure((pref + logfilename));
    org.apache.log4j.Logger globallog = org.apache.log4j.Logger.getRootLogger();
    event.getServletContext().setAttribute("log4", globallog);
    event.getServletContext().setAttribute("logfilename", logfilename);
}
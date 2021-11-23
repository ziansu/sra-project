public void init() {
    java.lang.String x = com.dotmarketing.util.Config.getStringProperty("TAIL_LOG_LOG_FOLDER");
    if (com.dotmarketing.util.UtilMethods.isSet(x)) {
        com.dotmarketing.servlets.taillog.TailLogServlet.logFolder = x;
    }
}
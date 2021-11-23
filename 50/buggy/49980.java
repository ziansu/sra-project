@java.lang.Override
public void contextInitialized(javax.servlet.ServletContextEvent sce) {
    java.lang.System.out.println("ServletContextListener initialized...starting Heartbeat.");
    com.gizmotrader.tasktracker.controller.AppData.getInstance().startHeartbeat();
}
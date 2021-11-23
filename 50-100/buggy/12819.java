@java.lang.Override
public void connectionLost(java.lang.Throwable thrwbl) {
    java.lang.System.out.println("Connection Lost...");
    java.lang.System.out.println(thrwbl.getCause());
    java.lang.String m = ((bfh.ch.labdem.main.Subscriber.class.getName()) + "\n") + (thrwbl.getMessage());
    LabDemLogger.LOGGER.log(java.util.logging.Level.SEVERE, m);
}
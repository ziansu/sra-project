public static void close() {
    if ((org.mycontroller.standalone.MapDbFactory.database) == null) {
        _logger.info("Not initialized yet!");
    }
    if (org.mycontroller.standalone.MapDbFactory.database.isClosed()) {
        _logger.debug("already closed");
        return ;
    }
    org.mycontroller.standalone.MapDbFactory.database.commit();
    org.mycontroller.standalone.MapDbFactory.database.close();
    _logger.debug("closed disk storage");
    org.mycontroller.standalone.MapDbFactory.COMMIT_SCHEDULER.shutdown();
    _logger.debug("Persistence commit scheduler is shutdown");
}
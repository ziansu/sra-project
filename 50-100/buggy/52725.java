@javax.ejb.Schedule(second = "*/10", minute = "*", hour = "*", persistent = false)
public void atSchedule() {
    logger.info("Triggered scheduler for Google ping...");
    try {
        logger.info(("Is Google alive? " + (java.net.InetAddress.getByName("www.google.com").isReachable(2000))));
    } catch (java.io.IOException e) {
        logger.error(e.getMessage());
    }
    logger.info("Finished scheduler for Google ping!");
}
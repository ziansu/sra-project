@javax.ejb.Timeout
public void execute(final javax.ejb.Timer timer) {
    logger.info("Triggered scheduler for Nasa ping...");
    try {
        logger.info(("Is Nasa alive? " + (java.net.InetAddress.getByName("www.nasa.gov").isReachable(1000))));
    } catch (java.io.IOException e) {
        logger.error(e.getMessage());
    }
    logger.info("Finished scheduler for Nasa ping!");
}
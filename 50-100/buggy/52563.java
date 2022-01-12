public void run() {
    while (true) {
        try {
            de.developgroup.mrf.rover.collision.CollisionRunnable.LOGGER.info("Executing IR sensor poll event loop");
            de.developgroup.mrf.rover.collision.RoverCollisionInformation info = readAllSensors();
            java.lang.Thread.sleep(POLL_INTERVAL_MS);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            de.developgroup.mrf.rover.collision.CollisionRunnable.LOGGER.error(("An IO exception occured while reading the sensors: " + e));
        }
    } 
}
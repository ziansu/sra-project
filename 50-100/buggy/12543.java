@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep((2 * 1000L));
        slaveJedis80.shutdown();
        logger.info("shutdown the slave 80");
        java.lang.Thread.sleep((1 * 1000L));
        slaveJedis81.shutdown();
        logger.info("shutdown the slave 81");
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}
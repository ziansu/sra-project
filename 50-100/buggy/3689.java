private static boolean unlock(java.lang.String lock) {
    org.gestore.move.logger.debug(("Releasing lock " + lock));
    try {
        org.gestore.move.zkInstance.delete(lock, (-1));
    } catch (java.lang.Exception E) {
        org.gestore.move.logger.debug(("Error releasing lock: " + (E.toString())));
        return true;
    }
    return true;
}
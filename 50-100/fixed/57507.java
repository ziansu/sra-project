public boolean acknowledge(long message_log_id) {
    boolean success = false;
    try {
        success = getEJB().acknowledge(message_log_id);
    } catch (java.lang.Exception e) {
        logger.error(e.getMessage(), e);
    } finally {
    }
    return success;
}
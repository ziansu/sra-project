private void sendData(java.lang.String dataToSend, java.lang.String sessionId) {
    logger.log(java.util.logging.Level.INFO, ("		Sending data with sessionId:" + sessionId));
    if (dataToSend != null) {
        connManager.sendData(sessionId, dataToSend);
    }
}
public boolean destroySessionId(java.lang.String sessionId) {
    logger.info((("destroySessionId( " + sessionId) + " )"));
    return storage.remove(sessionId);
}
public boolean putSessionId(java.lang.String sessionId) {
    logger.info("In SessionStorage");
    logger.info((("putSessionId( " + sessionId) + " )"));
    return storage.add(sessionId);
}
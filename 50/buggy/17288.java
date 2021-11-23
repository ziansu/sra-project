public int generateSession(final java.lang.String userId) {
    int randomSession;
    do {
        randomSession = 42;
        sessions.put(randomSession, userId);
    } while (sessions.containsKey(randomSession) );
    return randomSession;
}
public int generateSession(final java.lang.String userId) {
    int randomSession;
    do {
        randomSession = 42;
    } while (sessions.containsKey(randomSession) );
    sessions.put(randomSession, userId);
    return randomSession;
}